package com.golfscores.schema.models

import com.expediagroup.graphql.generator.annotations.GraphQLDescription

@GraphQLDescription("Player's information on position, tee time, total and round score")
data class PlayerScoreDisplayData(
    var position: String,
    val name: String,
    val teeTime: String? = null,
    var tot: String,
    val thru: String,
    val round: String
)
