package dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Ldtos/TeeTimeData;", "", "playerId", "", "teeTime", "Lorg/joda/time/DateTime;", "startTee", "(ILorg/joda/time/DateTime;I)V", "getPlayerId", "()I", "getStartTee", "getTeeTime", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "GolfScores"})
public final class TeeTimeData {
    private final int playerId = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.joda.time.DateTime teeTime = null;
    private final int startTee = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final dtos.TeeTimeData copy(int playerId, @org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime teeTime, int startTee) {
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
    
    public TeeTimeData(int playerId, @org.jetbrains.annotations.NotNull()
    org.joda.time.DateTime teeTime, int startTee) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPlayerId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.DateTime component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.joda.time.DateTime getTeeTime() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getStartTee() {
        return 0;
    }
}