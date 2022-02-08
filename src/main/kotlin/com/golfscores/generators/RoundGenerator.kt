package com.golfscores.generators

import com.golfscores.dtos.PlayerScoreData
import com.golfscores.repositories.PlayersRepository
import com.golfscores.repositories.ScoresRepository
import com.golfscores.repositories.ShotlinkTimeRepository
import com.golfscores.repositories.TeeTimesRepository
import com.golfscores.schema.models.PlayerScoreDisplayData
import dtos.ROUND
import dtos.RoundScoresRawData
import dtos.ShotlinkTimeData
import generators.ScoreRowGenerator
import org.joda.time.DateTime

class RoundGenerator(
    private val playersRepository: PlayersRepository,
    private val scoresRepository: ScoresRepository,
    private val shotlinkTimeRepository: ShotlinkTimeRepository,
    private val teeTimesRepository: TeeTimesRepository,
    private val positionGenerator: PositionGenerator,
    private val scoreRowGenerator: ScoreRowGenerator
) {

    private val players = playersRepository.getPlayers()

    fun generateRoundOne(currentDateTime: DateTime): List<PlayerScoreDisplayData> {
        val scores = scoresRepository.getScores(ROUND.ROUND_1)
        val scoreTimes = shotlinkTimeRepository.getScoreTimes(ROUND.ROUND_1)
        val roundOneTeeTimes = teeTimesRepository.getTeeTimes(ROUND.ROUND_1)

        val playersTeedOff = getPlayersTeedOff(scoreTimes, currentDateTime)

        playersTeedOff.forEach { pair ->
            val rawScoreData = scores.first { it.playerId == pair.first }.teeScores.first { it.hole == pair.second }

            val playerScoreData = PlayerScoreData(
                pair.first,
                pair.second,
                rawScoreData.tot,
                rawScoreData.round
            )
            positionGenerator.addPlayer(playerScoreData, rawScoreData.tot)
        }

        players.filter { player ->
            playersTeedOff.firstOrNull { it.first == player.id } == null
        }.onEach { player ->
            val roundOneTeeTime = roundOneTeeTimes.first { it.playerId == player.id }
            val playerScoreData = PlayerScoreData(
                player.id,
                roundOneTeeTime.startTee,
                tot = 0,
                round = 0,
                roundOneTeeTime.teeTime
            )
            positionGenerator.addPlayer(playerScoreData, score = 0)
        }

        return scoreRowGenerator.mapFromScore(players, positionGenerator.positions)
    }

    fun generateRoundTwo(currentDateTime: DateTime): List<PlayerScoreDisplayData> {
        val players = playersRepository.getPlayers()
        val scoresRoundOne = scoresRepository.getScores(ROUND.ROUND_1)
        val scoresRoundTwo = scoresRepository.getScores(ROUND.ROUND_2)
        val scoreTimes = shotlinkTimeRepository.getScoreTimes(ROUND.ROUND_2)
        val roundTwoTeeTimes = teeTimesRepository.getTeeTimes(ROUND.ROUND_2)

        val playersTeedOff = getPlayersTeedOff(scoreTimes, currentDateTime)

        playersTeedOff.forEach { pair ->
            val rawScoreDataRoundTwo =
                scoresRoundTwo.first { it.playerId == pair.first }.teeScores.first { it.hole == pair.second }

            val playerScoreData = PlayerScoreData(
                pair.first,
                pair.second,
                rawScoreDataRoundTwo.tot,
                rawScoreDataRoundTwo.round
            )
            positionGenerator.addPlayer(playerScoreData, rawScoreDataRoundTwo.tot)
        }

        players.filter { player ->
            playersTeedOff.firstOrNull { it.first == player.id } == null
        }.forEach { player ->
            val roundOneTotal =
                scoresRoundOne.first { it.playerId == player.id }.teeScores.first { it.hole == 18 }.tot
            val roundOneTeeTime = roundTwoTeeTimes.first { it.playerId == player.id }

            val playerScoreData = PlayerScoreData(
                player.id,
                roundTwoTeeTimes.first { it.playerId == player.id }.startTee,
                roundOneTotal,
                0,
                roundOneTeeTime.teeTime
            )
            positionGenerator.addPlayer(playerScoreData, roundOneTotal)
        }

        return scoreRowGenerator.mapFromScore(players, positionGenerator.positions)
    }

    fun generateRoundThree(currentDateTime: DateTime): List<PlayerScoreDisplayData> {
        val scoresRoundTwo = scoresRepository.getScores(ROUND.ROUND_2)
        val scoresRoundThree = scoresRepository.getScores(ROUND.ROUND_3)
        val scoreTimes = shotlinkTimeRepository.getScoreTimes(ROUND.ROUND_3)
        val roundThreeTeeTimes = teeTimesRepository.getTeeTimes(ROUND.ROUND_3)
        val missedCutPlayers = scoresRepository.getMissedCutPlayers()

        val playersTeedOff = getPlayersTeedOff(scoreTimes, currentDateTime)

        playersTeedOff.forEach { pair ->
            val rawScoreDataRoundThree =
                scoresRoundThree.first { it.playerId == pair.first }.teeScores.first { it.hole == pair.second }

            val playerScoreData = PlayerScoreData(
                pair.first,
                pair.second,
                rawScoreDataRoundThree.tot,
                rawScoreDataRoundThree.round
            )
            positionGenerator.addPlayer(playerScoreData, rawScoreDataRoundThree.tot)
        }

        players
            .filter { player ->
                missedCutPlayers.firstOrNull { it == player.id } == null
            }
            .filter { player ->
                playersTeedOff.firstOrNull { it.first == player.id } == null
            }.forEach { player ->
                val roundTwoTotal =
                    scoresRoundTwo.first { it.playerId == player.id }.teeScores.first { it.hole == 18 }.tot
                val roundThreeTeeTime = roundThreeTeeTimes.first { it.playerId == player.id }

                val playerScoreData = PlayerScoreData(
                    player.id,
                    roundThreeTeeTime.startTee,
                    roundTwoTotal,
                    0,
                    roundThreeTeeTime.teeTime
                )
                positionGenerator.addPlayer(playerScoreData, roundTwoTotal)
            }

        val missedCutPlayersList = generateMissedCutPlayers(missedCutPlayers, scoresRoundTwo)

        val playerScoresDisplayDataList = scoreRowGenerator.mapFromScore(players, positionGenerator.positions)
        return playerScoresDisplayDataList + missedCutPlayersList
    }

    fun generateRoundFour(currentDateTime: DateTime): List<PlayerScoreDisplayData> {
        val scoresRoundTwo = scoresRepository.getScores(ROUND.ROUND_2)
        val scoresRoundThree = scoresRepository.getScores(ROUND.ROUND_3)
        val scoresRoundFour = scoresRepository.getScores(ROUND.ROUND_4)
        val scoreTimes = shotlinkTimeRepository.getScoreTimes(ROUND.ROUND_4)
        val roundFourTeeTimes = teeTimesRepository.getTeeTimes(ROUND.ROUND_4)
        val missedCutPlayers = scoresRepository.getMissedCutPlayers()

        val playersTeedOff = getPlayersTeedOff(scoreTimes, currentDateTime)

        playersTeedOff.forEach { pair ->
            val rawScoreDataRoundThree =
                scoresRoundFour.first { it.playerId == pair.first }.teeScores.first { it.hole == pair.second }

            val playerScoreData = PlayerScoreData(
                pair.first,
                pair.second,
                rawScoreDataRoundThree.tot,
                rawScoreDataRoundThree.round
            )
            positionGenerator.addPlayer(playerScoreData, rawScoreDataRoundThree.tot)
        }

        players.filter { player ->
            playersTeedOff.firstOrNull { it.first == player.id } == null && missedCutPlayers.firstOrNull { it == player.id } == null
        }.forEach { player ->
            val roundThreeTotal =
                scoresRoundThree.first { it.playerId == player.id }.teeScores.first { it.hole == 18 }.tot
            val roundFourTeeTime = roundFourTeeTimes.first { it.playerId == player.id }

            val playerScoreData = PlayerScoreData(
                player.id,
                roundFourTeeTime.startTee,
                roundThreeTotal,
                round = 0,
                roundFourTeeTime.teeTime
            )
            positionGenerator.addPlayer(playerScoreData, roundThreeTotal)
        }

        val missedCutPlayersList = generateMissedCutPlayers(missedCutPlayers, scoresRoundTwo)

        val playerScoresDisplayDataList = scoreRowGenerator.mapFromScore(players, positionGenerator.positions)
        return playerScoresDisplayDataList + missedCutPlayersList
    }

    private fun generateMissedCutPlayers(
        missedCutPlayers: List<Int>,
        scoresRoundTwo: List<RoundScoresRawData>
    ): List<PlayerScoreDisplayData> =
        missedCutPlayers.map { playerId ->
            val player = players.first { it.id == playerId }
            val roundTwoTotal =
                scoresRoundTwo.first { it.playerId == playerId }.teeScores.first { it.hole == 18 }.tot

            val playerScoreData = PlayerScoreData(
                playerId,
                thru = 0,
                roundTwoTotal,
                round = 0
            )
            scoreRowGenerator.mapFromMissedCut(player, playerScoreData)
        }

    private fun getPlayersTeedOff(
        scoreTimes: List<ShotlinkTimeData>,
        currentDateTime: DateTime
    ): List<Pair<Int, Int>> =
        scoreTimes
            .filter { it.startTime.isBefore(currentDateTime) && !it.startTime.isEqual(currentDateTime) }
            .groupBy { it.playerId }
            .map {
                val max = it.value.maxOf { it.tee }
                Pair(it.key, max)
            }

}
