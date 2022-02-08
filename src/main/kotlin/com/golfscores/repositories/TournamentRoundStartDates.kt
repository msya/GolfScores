package com.golfscores.repositories

import createDateTime
import org.joda.time.DateTime

data class TournamentRoundStartDates(
    val roundOne: DateTime = createDateTime("2019-04-11T13:30"),
    val roundTwo: DateTime = createDateTime("2019-04-12T13:30"),
    val roundThree: DateTime = createDateTime("22019-04-13T14:05"),
    val roundFour: DateTime = createDateTime("2019-04-14T12:30")
)
