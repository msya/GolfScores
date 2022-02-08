package com.golfscores.di

import com.golfscores.repositories.PlayersRepository
import com.golfscores.repositories.ScoresRepository
import com.golfscores.repositories.ShotlinkTimeRepository
import com.golfscores.repositories.TeeTimesRepository
import com.golfscores.repositories.WeatherRepository

object RepositoryModule {

    fun providePlayerRepository(): PlayersRepository {
        val moshi = MoshiAdapterModule.providesMoshi()
        val playersAdapter = MoshiAdapterModule.providePlayersAdapter(moshi)
        return PlayersRepository(playersAdapter)
    }

    fun provideScoresRepository(): ScoresRepository {
        val moshi = MoshiAdapterModule.providesMoshi()
        val scoresAdapter = MoshiAdapterModule.provideScoresAdapter(moshi)
        return ScoresRepository(scoresAdapter)
    }

    fun provideShotlinkRepository(): ShotlinkTimeRepository {
        val moshi = MoshiAdapterModule.providesMoshi()
        val shotlinkDataAdapter = MoshiAdapterModule.provideShotlinkDataAdapter(moshi)
        return ShotlinkTimeRepository(shotlinkDataAdapter)
    }

    fun provideTeeTimesRepository(): TeeTimesRepository {
        val moshi = MoshiAdapterModule.providesMoshi()
        val teeTimesAdapter = MoshiAdapterModule.provideTeeTimesAdapter(moshi)
        return TeeTimesRepository(teeTimesAdapter)
    }

    fun provideWeatherRepository(): WeatherRepository {
        val weatherAdapter = MoshiAdapterModule.provideWeatherDataAdapter()
        return WeatherRepository(weatherAdapter)
    }

}