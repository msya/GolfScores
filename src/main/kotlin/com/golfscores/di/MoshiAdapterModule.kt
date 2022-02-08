package com.golfscores.di

import JodaDateTimeAdapter
import com.golfscores.dtos.Player
import com.golfscores.schema.models.WeatherData
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dtos.RoundScoresRawData
import dtos.ShotlinkTimeData
import com.golfscores.dtos.TeeTimeData

object MoshiAdapterModule {

    fun providePlayersAdapter(moshi: Moshi): JsonAdapter<List<Player>> {
        val listMyData = Types.newParameterizedType(MutableList::class.java, Player::class.java)
        return moshi.adapter(listMyData)
    }

    fun provideTeeTimesAdapter(moshi: Moshi): JsonAdapter<List<TeeTimeData>> {
        val listMyData = Types.newParameterizedType(MutableList::class.java, TeeTimeData::class.java)
        return moshi.adapter(listMyData)
    }

    fun provideScoresAdapter(moshi: Moshi): JsonAdapter<List<RoundScoresRawData>> {
        val listMyData = Types.newParameterizedType(MutableList::class.java, RoundScoresRawData::class.java)
        return moshi.adapter(listMyData)
    }

    fun provideShotlinkDataAdapter(moshi: Moshi): JsonAdapter<List<ShotlinkTimeData>> {
        val listMyData = Types.newParameterizedType(MutableList::class.java, ShotlinkTimeData::class.java)
        return moshi.adapter(listMyData)
    }

    fun provideWeatherDataAdapter(): JsonAdapter<List<WeatherData>> {
        val moshi = Moshi.Builder()
            .add(JodaDateTimeAdapter())
            .addLast(KotlinJsonAdapterFactory())
            .build()

        val listMyData = Types.newParameterizedType(MutableList::class.java, WeatherData::class.java)
        return moshi.adapter(listMyData)
    }

    fun providesMoshi(): Moshi =
        Moshi.Builder()
            .add(JodaDateTimeAdapter())
            .addLast(KotlinJsonAdapterFactory())
            .build()

}
