package com.golfscores.dtos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/golfscores/dtos/PlayerScoreData;", "", "playerId", "", "thru", "tot", "round", "teeTime", "Lorg/joda/time/DateTime;", "(IIIILorg/joda/time/DateTime;)V", "getPlayerId", "()I", "getRound", "getTeeTime", "()Lorg/joda/time/DateTime;", "getThru", "getTot", "setTot", "(I)V", "equals", "", "other", "hashCode", "GolfScores"})
public final class PlayerScoreData {
    private final int playerId = 0;
    private final int thru = 0;
    private int tot;
    private final int round = 0;
    @org.jetbrains.annotations.Nullable()
    private final org.joda.time.DateTime teeTime = null;
    
    public PlayerScoreData(int playerId, int thru, int tot, int round, @org.jetbrains.annotations.Nullable()
    org.joda.time.DateTime teeTime) {
        super();
    }
    
    public final int getPlayerId() {
        return 0;
    }
    
    public final int getThru() {
        return 0;
    }
    
    public final int getTot() {
        return 0;
    }
    
    public final void setTot(int p0) {
    }
    
    public final int getRound() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.joda.time.DateTime getTeeTime() {
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
}