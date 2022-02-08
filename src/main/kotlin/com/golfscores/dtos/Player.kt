package com.golfscores.dtos

data class Player(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val weight: Int,
    val heightCm: Double,
    val birthplace: String,
    val turnedProYear: Int
)
