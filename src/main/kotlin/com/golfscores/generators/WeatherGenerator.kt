package com.golfscores.generators

import com.golfscores.schema.models.WeatherData
import com.golfscores.repositories.WeatherRepository
import createDateTime
import dtos.ROUND
import org.joda.time.DateTime

class WeatherGenerator(private val repository: WeatherRepository) {

    fun generate(round: ROUND, currentDateTime: DateTime): WeatherData {
        val weatherDataList = repository.getWeatherData(round)
        return weatherDataList.last {
            createDateTime(it.time).isBefore(currentDateTime)
        }
    }

}
