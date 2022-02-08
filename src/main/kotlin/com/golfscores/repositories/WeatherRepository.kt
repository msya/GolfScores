package com.golfscores.repositories

import com.golfscores.schema.models.WeatherData
import com.squareup.moshi.JsonAdapter
import dtos.ROUND
import okio.buffer
import okio.source
import java.nio.file.Paths

class WeatherRepository(private val weatherJsonAdapter: JsonAdapter<List<WeatherData>>) {

    companion object {
        const val ROUND_1_WEATHER = "src/main/resources/json.weather/masters_2019_round_1_weather.json"
        const val ROUND_2_WEATHER = "src/main/resources/json.weather/masters_2019_round_2_weather.json"
        const val ROUND_3_WEATHER = "src/main/resources/json.weather/masters_2019_round_3_weather.json"
        const val ROUND_4_WEATHER = "src/main/resources/json.weather/masters_2019_round_4_weather.json"
    }

    private val weatherData = mutableListOf<WeatherData>()

    fun getWeatherData(round: ROUND): List<WeatherData> {
        val file = when (round) {
            ROUND.ROUND_1 -> ROUND_1_WEATHER
            ROUND.ROUND_2 -> ROUND_2_WEATHER
            ROUND.ROUND_3 -> ROUND_3_WEATHER
            ROUND.ROUND_4 -> ROUND_4_WEATHER
        }

        if (weatherData.isEmpty()) {
            val bufferedSource = Paths.get(file).source().buffer()
            weatherJsonAdapter.fromJson(bufferedSource)?.let { weatherData.addAll(it) }
        }
        return weatherData
    }

}
