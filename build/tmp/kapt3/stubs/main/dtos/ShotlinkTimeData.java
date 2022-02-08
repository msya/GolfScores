package dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001a"}, d2 = {"Ldtos/ShotlinkTimeData;", "", "playerId", "", "tee", "startTime", "Lorg/joda/time/DateTime;", "endTime", "(IILorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getEndTime", "()Lorg/joda/time/DateTime;", "getPlayerId", "()I", "getStartTime", "getTee", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "GolfScores"})
public final class ShotlinkTimeData {
    private final int playerId = 0;
    private final int tee = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.joda.time.DateTime startTime = null;
    @org.jetbrains.annotations.NotNull()
    private final org.joda.time.DateTime endTime = null;
    
    @org.jetbrains.annotations.NotNull()
    public final dtos.ShotlinkTimeData copy(int playerId, int tee, @org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime startTime, @org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime endTime) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ShotlinkTimeData(int playerId, int tee, @org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime startTime, @org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime endTime) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPlayerId() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTee() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.DateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.DateTime getStartTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.DateTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.DateTime getEndTime() {
        return null;
    }
}