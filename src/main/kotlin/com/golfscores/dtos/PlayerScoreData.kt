package com.golfscores.dtos

import org.joda.time.DateTime

class PlayerScoreData(
    val playerId: Int,
    val thru: Int,
    var tot: Int,
    val round: Int,
    val teeTime: DateTime? = null
) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PlayerScoreData

        if (playerId != other.playerId) return false

        return true
    }

    override fun hashCode(): Int {
        return playerId
    }

}
