package dtos

data class RoundScoresRawData(
    val playerId: Int,
    val teeScores: List<TeeScoreData>,
    val outTotal: Int,
    val inTotal: Int,
    val total: Int
)

enum class ROUND {
    ROUND_1,
    ROUND_2,
    ROUND_3,
    ROUND_4
}


data class TeeScoreData(val hole: Int, val par: Int, val round: Int, val tot: Int, val score: Int)