import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.format.DateTimeFormat

class JodaDateTimeAdapter {

    companion object {
        const val DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss Z"
        const val EST_TIME_ZONE = "EST"
    }

    private val dateTimeFormatter = DateTimeFormat
        .forPattern(DATE_TIME_FORMAT)
        .withZone(DateTimeZone.forID(EST_TIME_ZONE))

    @ToJson
    fun toJson(dateTime: DateTime?): String = dateTimeFormatter.print(dateTime)

    @FromJson
    fun fromJson(dateTime: String?): DateTime = dateTimeFormatter.parseDateTime(dateTime)

}
