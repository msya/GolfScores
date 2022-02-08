package dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001e"}, d2 = {"Ldtos/RoundScoresRawData;", "", "playerId", "", "teeScores", "", "Ldtos/TeeScoreData;", "outTotal", "inTotal", "total", "(ILjava/util/List;III)V", "getInTotal", "()I", "getOutTotal", "getPlayerId", "getTeeScores", "()Ljava/util/List;", "getTotal", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "GolfScores"})
public final class RoundScoresRawData {
    private final int playerId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<dtos.TeeScoreData> teeScores = null;
    private final int outTotal = 0;
    private final int inTotal = 0;
    private final int total = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final dtos.RoundScoresRawData copy(int playerId, @org.jetbrains.annotations.NotNull()
    java.util.List<dtos.TeeScoreData> teeScores, int outTotal, int inTotal, int total) {
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
    
    public RoundScoresRawData(int playerId, @org.jetbrains.annotations.NotNull()
    java.util.List<dtos.TeeScoreData> teeScores, int outTotal, int inTotal, int total) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPlayerId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dtos.TeeScoreData> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dtos.TeeScoreData> getTeeScores() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getOutTotal() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getInTotal() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
}