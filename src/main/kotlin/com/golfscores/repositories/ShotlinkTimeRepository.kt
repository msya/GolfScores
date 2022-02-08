package com.golfscores.repositories

import com.squareup.moshi.JsonAdapter
import dtos.ROUND
import dtos.ShotlinkTimeData
import okio.buffer
import okio.source
import java.nio.file.Paths

class ShotlinkTimeRepository(private val shotlinkTimeAdapter: JsonAdapter<List<ShotlinkTimeData>>) {

    companion object {
        const val ROUND_1_SCORE_TIMES_CSV_FILE_PATH = "src/main/resources/json.shotlink_data/masters_2019_round_1_score_times.json"
        const val ROUND_2_SCORE_TIMES_CSV_FILE_PATH = "src/main/resources/json.shotlink_data/masters_2019_round_2_score_times.json"
        const val ROUND_3_SCORE_TIMES_CSV_FILE_PATH = "src/main/resources/json.shotlink_data/masters_2019_round_3_score_times.json"
        const val ROUND_4_SCORE_TIMES_CSV_FILE_PATH = "src/main/resources/json.shotlink_data/masters_2019_round_4_score_times.json"
    }

    private val shotlinkTimeData = mutableListOf<ShotlinkTimeData>()

    fun getScoreTimes(round: ROUND): List<ShotlinkTimeData> {
        val file = when (round) {
            ROUND.ROUND_1 -> ROUND_1_SCORE_TIMES_CSV_FILE_PATH
            ROUND.ROUND_2 -> ROUND_2_SCORE_TIMES_CSV_FILE_PATH
            ROUND.ROUND_3 -> ROUND_3_SCORE_TIMES_CSV_FILE_PATH
            ROUND.ROUND_4 -> ROUND_4_SCORE_TIMES_CSV_FILE_PATH
        }

        val bufferedSource = Paths.get(file).source().buffer()

        if (shotlinkTimeData.isEmpty()) {
            shotlinkTimeAdapter.fromJson(bufferedSource)?.let { shotlinkTimeData.addAll(it) }
        }
        return shotlinkTimeData
    }
}
