package com.golfscores.repositories

import com.squareup.moshi.JsonAdapter
import dtos.ROUND
import dtos.ROUND.*
import dtos.RoundScoresRawData
import okio.buffer
import okio.source
import java.nio.file.Paths

class ScoresRepository(private val scoresAdapter: JsonAdapter<List<RoundScoresRawData>>) {

    companion object {
        const val ROUND_1_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_1_scores.json"
        const val ROUND_2_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_2_scores.json"
        const val ROUND_3_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_3_scores.json"
        const val ROUND_4_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_4_scores.json"
    }

    private val scores = mutableListOf<RoundScoresRawData>()

    fun getScores(round: ROUND): List<RoundScoresRawData> {
        val file = when (round) {
            ROUND_1 -> ROUND_1_SCORES_CSV_FILE_PATH
            ROUND_2 -> ROUND_2_SCORES_CSV_FILE_PATH
            ROUND_3 -> ROUND_3_SCORES_CSV_FILE_PATH
            ROUND_4 -> ROUND_4_SCORES_CSV_FILE_PATH
        }

        if (scores.isEmpty()) {
            val bufferedSource = Paths.get(file).source().buffer()
            scoresAdapter.fromJson(bufferedSource)?.let { scores.addAll(it) }
        }
        return scores
    }

    fun getMissedCutPlayers() =
        scores
            .filter { it.teeScores.any { teeScoreData -> teeScoreData.tot >= 4 && teeScoreData.hole == 18 } }
            .map { it.playerId }
}
