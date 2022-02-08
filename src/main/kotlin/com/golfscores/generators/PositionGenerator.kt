package com.golfscores.generators

import com.golfscores.dtos.PlayerScoreData
import java.util.*
import kotlin.collections.HashMap

class PositionGenerator {

    var playerScores: MutableMap<PlayerScoreData, Int> = HashMap()
    var positions: MutableMap<Int, MutableList<PlayerScoreData>> = TreeMap { o1: Int, o2: Int -> o1 - o2 }

    fun addPlayer(playerId: PlayerScoreData, score: Int) {
        playerScores[playerId] = score
        addScoreToRankMap(playerId, score)
    }

    fun updateEntry(playerScoreData: PlayerScoreData) {
        var existingScore = 0
        if (playerScores.containsKey(playerScoreData)) {
            existingScore = playerScores[playerScoreData]!!
        }
        playerScores[playerScoreData] = playerScoreData.tot

        if (existingScore != 0) {
            positions[existingScore]!!.remove(playerScoreData)
            if (positions[existingScore]?.isEmpty() == true) {
                positions.remove(existingScore)
            }
        }

        addScoreToRankMap(playerScoreData, playerScoreData.tot)
    }

    private fun addScoreToRankMap(playerId: PlayerScoreData, score: Int) {
        if (positions.containsKey(score)) {
            val names = positions[score]!!
            names.add(playerId)
        } else {
            val playersList = mutableListOf<PlayerScoreData>()
            playersList.add(playerId)
            positions[score] = playersList
        }
    }
}
