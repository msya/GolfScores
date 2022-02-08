
import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"LJodaDateTimeAdapter;", "", "()V", "dateTimeFormatter", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "fromJson", "Lorg/joda/time/DateTime;", "dateTime", "", "toJson", "Companion", "GolfScores"})
public final class JodaDateTimeAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final JodaDateTimeAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss Z";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EST_TIME_ZONE = "EST";
    private final org.joda.time.format.DateTimeFormatter dateTimeFormatter = null;
    
    @javax.inject.Inject()
    public JodaDateTimeAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.ToJson()
    public final java.lang.String toJson(@org.jetbrains.annotations.Nullable()
    org.joda.time.DateTime dateTime) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.FromJson()
    public final org.joda.time.DateTime fromJson(@org.jetbrains.annotations.Nullable()
    java.lang.String dateTime) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"LJodaDateTimeAdapter$Companion;", "", "()V", "DATE_TIME_FORMAT", "", "EST_TIME_ZONE", "GolfScores"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}