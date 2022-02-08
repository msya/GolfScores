package com.golfscores.repositories

import com.squareup.moshi.JsonAdapter
import dtos.ROUND
import com.golfscores.dtos.TeeTimeData
import okio.buffer
import okio.source
import java.nio.file.Paths

class TeeTimesRepository(private val teeTimesAdapter: JsonAdapter<List<TeeTimeData>>) {

    companion object {
        const val ROUND_1_TEE_TIMES_CSV_FILE_PATH = "src/main/resources/json.tee-times/masters_2019_round_1_tee_times.json"
        const val ROUND_2_TEE_TIMES_CSV_FILE_PATH = "src/main/resources/json.tee-times/masters_2019_round_2_tee_times.json"
        const val ROUND_3_TEE_TIMES_CSV_FILE_PATH = "src/main/resources/json.tee-times/masters_2019_round_3_tee_times.json"
        const val ROUND_4_TEE_TIMES_CSV_FILE_PATH = "src/main/resources/json.tee-times/masters_2019_round_4_tee_times.json"
    }

    private val teeTimes = mutableListOf<TeeTimeData>()

    fun getTeeTimes(round: ROUND): List<TeeTimeData> {
        val file = when (round) {
            ROUND.ROUND_1 -> ROUND_1_TEE_TIMES_CSV_FILE_PATH
            ROUND.ROUND_2 -> ROUND_2_TEE_TIMES_CSV_FILE_PATH
            ROUND.ROUND_3 -> ROUND_3_TEE_TIMES_CSV_FILE_PATH
            ROUND.ROUND_4 -> ROUND_4_TEE_TIMES_CSV_FILE_PATH
        }

        val bufferedSource = Paths.get(file).source().buffer()
        if (teeTimes.isEmpty()) {
            teeTimesAdapter.fromJson(bufferedSource)?.let { teeTimes.addAll(it) }
        }
        return teeTimes
    }
}
