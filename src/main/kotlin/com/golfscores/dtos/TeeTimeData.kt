package com.golfscores.dtos

import org.joda.time.DateTime

data class TeeTimeData(
    val playerId: Int,
    val teeTime: DateTime,
    val startTee: Int
)
