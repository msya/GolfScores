package com.golfscores.generators

import com.golfscores.dtos.PlayerScoreData
import com.golfscores.repositories.PlayersRepository
import com.golfscores.repositories.TeeTimesRepository
import com.golfscores.schema.models.PlayerScoreDisplayData
import dtos.ROUND
import generators.ScoreRowGenerator

class TeeTimesGenerator(
    private val playersRepository: PlayersRepository,
    private val teeTimesRepository: TeeTimesRepository,
    private val positionGenerator: PositionGenerator,
    private val scoreRowGenerator: ScoreRowGenerator
) {

    private val players = playersRepository.getPlayers()

    fun generateTeeTimes(round: ROUND): List<PlayerScoreDisplayData> {
        players.forEach {
            positionGenerator.addPlayer(
                PlayerScoreData(
                    it.id,
                    thru = 0,
                    tot = 0,
                    round = 0
                ),
                score = 0
            )
        }
        return mapTeeTimes(round)
    }

    private fun mapTeeTimes(round: ROUND): List<PlayerScoreDisplayData> {
        val teeTimes = teeTimesRepository.getTeeTimes(round)
        return teeTimes
            .sortedBy { it.teeTime }
            .map { teeTimeData ->
                val player = players.first { it.id == teeTimeData.playerId }
                scoreRowGenerator.mapFromTeeTimes(player, teeTimeData)
            }
    }
}
