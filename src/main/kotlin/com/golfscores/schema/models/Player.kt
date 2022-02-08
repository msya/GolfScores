package com.golfscores.schema.models

import com.expediagroup.graphql.generator.annotations.GraphQLDescription

@GraphQLDescription("Player's information")
data class Player(
    val firstName: String,
    val lastName: String,
    val weight: Int,
    val heightCm: Double,
    val birthplace: String,
    val turnedProYear: Int
)
