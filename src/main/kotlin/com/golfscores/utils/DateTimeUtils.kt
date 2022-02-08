import com.golfscores.repositories.TournamentRoundStartDates
import dtos.ROUND
import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

fun createDateTime(time: String): DateTime =
    DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm")
        .parseDateTime(time)

fun DateTime.isBeforeRoundOne(): Boolean {
     val roundStartDates = TournamentRoundStartDates()
    return this.isBefore(roundStartDates.roundOne) || this.equals(roundStartDates.roundOne)
}

fun DateTime.isWithinRound(round: ROUND): Boolean {
    val roundStartDates = TournamentRoundStartDates()

    val boundaries = when (round) {
        ROUND.ROUND_1 -> Pair(roundStartDates.roundOne, roundStartDates.roundTwo)
        ROUND.ROUND_2 -> Pair(roundStartDates.roundTwo, roundStartDates.roundThree)
        ROUND.ROUND_3 -> Pair(roundStartDates.roundThree, roundStartDates.roundFour)
        ROUND.ROUND_4 -> Pair(roundStartDates.roundFour, roundStartDates.roundFour.plusHours(20))
    }

    return this.isEqual(boundaries.first) ||
            this.isAfter(boundaries.first) &&
            this.isBefore(boundaries.second)
}
