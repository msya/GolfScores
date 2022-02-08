package generators

import com.golfscores.dtos.Player
import com.golfscores.dtos.PlayerScoreData
import com.golfscores.dtos.TeeTimeData
import com.golfscores.schema.models.PlayerScoreDisplayData
import org.joda.time.format.DateTimeFormat

class ScoreRowGenerator {

    companion object {
        private const val TEE_TIME_PATTERN = "h:mm"
    }

    private val dateTimeFormatter = DateTimeFormat.forPattern(TEE_TIME_PATTERN)

    fun mapFromTeeTimes(
        player: Player,
        teeTimeData: TeeTimeData
    ) = PlayerScoreDisplayData(
        position = "-",
        name = "${player.firstName} ${player.lastName}",
        teeTime = dateTimeFormatter.print(teeTimeData.teeTime),
        tot = "-",
        thru = teeTimeData.startTee.toString(),
        round = "-"
    )

    fun mapFromMissedCut(
        player: Player,
        playerScoreData: PlayerScoreData
    ): PlayerScoreDisplayData {

        val total = if (playerScoreData.tot > 0) {
            "+${playerScoreData.tot}"
        } else if (playerScoreData.tot == 0) {
            "E"
        } else {
            playerScoreData.tot.toString()
        }

        return PlayerScoreDisplayData(
            position = "Cut",
            name = "${player.firstName} ${player.lastName}",
            tot = total,
            thru = "-",
            round = "-"
        )
    }

    fun mapFromScore(players: List<Player>, positions: Map<Int, List<PlayerScoreData>>): List<PlayerScoreDisplayData> {
        val playerScoreDisplayDataList = mutableListOf<PlayerScoreDisplayData>()

        positions.onEachIndexed { index, entry ->
            val isTied = entry.value.size > 1

            entry.value.forEach { playerScoreData ->
                val player = players.first { it.id == playerScoreData.playerId }
                val position = index + 1

                val total = if (playerScoreData.tot > 0) {
                    "+${playerScoreData.tot}"
                } else if (playerScoreData.tot == 0) {
                    "E"
                } else {
                    playerScoreData.tot.toString()
                }

                val round = if (playerScoreData.round > 0) {
                    "+${playerScoreData.round}"
                } else if (playerScoreData.round == 0) {
                    "E"
                } else  {
                    playerScoreData.round.toString()
                }

                val teeTime = playerScoreData.teeTime?.let {
                    dateTimeFormatter.print(playerScoreData.teeTime)
                } ?: "-"

                val pos = if (isTied) {
                    "T${position}"
                } else {
                    position.toString()
                }

                val displayData = PlayerScoreDisplayData(
                    position = pos,
                    name = "${player.firstName} ${player.lastName}",
                    teeTime = teeTime,
                    tot = total,
                    thru = playerScoreData.thru.toString(),
                    round = round
                )
                playerScoreDisplayDataList.add(displayData)
            }
        }
        return playerScoreDisplayDataList
    }

}
