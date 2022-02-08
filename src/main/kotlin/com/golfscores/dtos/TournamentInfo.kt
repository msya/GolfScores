package com.golfscores.dtos

import com.expediagroup.graphql.generator.annotations.GraphQLDescription

@GraphQLDescription("Tournament name and start and end dates.")
data class TournamentInfo(
    val name: String = "Masters Tournament",
    val date: String = "Thursday April 11 - Sunday April 14, 2019",
    val logo: String = "https://photo-assets.masters.com/images/pics/misc/masters_txt_001.gif"
)
