package com.golfscores.schema.models

data class WeatherData(
    val time: String,
    val temperature: String,
    val wind_direction: String,
    val wind_speed: String,
    val condition: Condition
)

enum class Condition {
    CLOUDY,
    MOSTLY_CLOUDY,
    PARTLY_CLOUDY,
    FAIR
}
