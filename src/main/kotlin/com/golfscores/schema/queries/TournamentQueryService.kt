package com.golfscores.schema.queries

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.server.operations.Query
import com.golfscores.di.RepositoryModule
import com.golfscores.dtos.Player
import com.golfscores.dtos.TournamentInfo
import com.golfscores.schema.models.WeatherData
import com.golfscores.generators.PositionGenerator
import com.golfscores.generators.RoundGenerator
import com.golfscores.generators.TeeTimesGenerator
import com.golfscores.generators.WeatherGenerator
import com.golfscores.schema.models.PlayerScoreDisplayData
import createDateTime
import dtos.ROUND
import generators.ScoreRowGenerator
import isBeforeRoundOne
import isWithinRound

class TournamentQueryService : Query {

    private val playersRepository = RepositoryModule.providePlayerRepository()
    private val scoresRepository = RepositoryModule.provideScoresRepository()
    private val shotlinkTimeRepository = RepositoryModule.provideShotlinkRepository()
    private val teeTimesRepository = RepositoryModule.provideTeeTimesRepository()
    private val weatherRepository = RepositoryModule.provideWeatherRepository()

    private val positionGenerator = PositionGenerator()
    private val scoreRowGenerator = ScoreRowGenerator()
    private val teeTimesGenerator = TeeTimesGenerator(
        playersRepository,
        teeTimesRepository,
        positionGenerator,
        scoreRowGenerator
    )

    private val roundGenerator = RoundGenerator(
        playersRepository,
        scoresRepository,
        shotlinkTimeRepository,
        teeTimesRepository,
        positionGenerator,
        scoreRowGenerator
    )

    private val weatherGenerator = WeatherGenerator(weatherRepository)

    @GraphQLDescription("Return list of scores")
    fun scores(params: TournamentQueryParameters) = createSnapshot(params.time)

    @GraphQLDescription("Returns weather data for time")
    fun weather(params: TournamentQueryParameters) = getWeatherData(params.time)

    private fun createSnapshot(timestamp: String): List<PlayerScoreDisplayData> {
        val currentDateTime = createDateTime(timestamp)

        return when {
            currentDateTime.isBeforeRoundOne() ->
                teeTimesGenerator.generateTeeTimes(ROUND.ROUND_1)

            currentDateTime.isWithinRound(ROUND.ROUND_1) ->
                roundGenerator.generateRoundOne(currentDateTime = currentDateTime)

            currentDateTime.isWithinRound(ROUND.ROUND_2) ->
                roundGenerator.generateRoundTwo(currentDateTime)

            currentDateTime.isWithinRound(ROUND.ROUND_3) ->
                roundGenerator.generateRoundThree(currentDateTime)

            currentDateTime.isWithinRound(ROUND.ROUND_4) ->
                roundGenerator.generateRoundFour(
                    currentDateTime
                )

            else -> emptyList()
        }
    }

    private fun getWeatherData(timestamp: String): WeatherData {
        val currentDateTime = createDateTime(timestamp)
        println(currentDateTime)

        return when {
            currentDateTime.isBeforeRoundOne() ->
                weatherGenerator.generate(ROUND.ROUND_1, currentDateTime)

            currentDateTime.isWithinRound(ROUND.ROUND_2) ->
                weatherGenerator.generate(ROUND.ROUND_2, currentDateTime)

            currentDateTime.isWithinRound(ROUND.ROUND_3) ->
                weatherGenerator.generate(ROUND.ROUND_3, currentDateTime)

            else -> weatherGenerator.generate(ROUND.ROUND_4, currentDateTime)
        }
    }

    @GraphQLDescription("Returns tournament information")
    fun tournamentInfo() = TournamentInfo()

    @GraphQLDescription("Returns get players")
    fun players() = playersRepository.getPlayers()

}

data class TournamentQueryParameters(val time: String)
