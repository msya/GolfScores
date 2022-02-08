package dtos

import org.joda.time.DateTime

data class ShotlinkTimeData(
    val playerId: Int,
    val tee: Int,
    val startTime: DateTime,
    val endTime: DateTime
)
