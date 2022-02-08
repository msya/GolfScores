package com.golfscores.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u000f\u001a\u00020\bH\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/golfscores/di/MoshiAdapterModule;", "", "()V", "providePlayersAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/golfscores/dtos/Player;", "moshi", "Lcom/squareup/moshi/Moshi;", "provideScoresAdapter", "Ldtos/RoundScoresRawData;", "provideShotlinkDataAdapter", "Ldtos/ShotlinkTimeData;", "provideTeeTimesAdapter", "Ldtos/TeeTimeData;", "providesMoshi", "GolfScores"})
@dagger.Module()
public final class MoshiAdapterModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.golfscores.di.MoshiAdapterModule INSTANCE = null;
    
    private MoshiAdapterModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.JsonAdapter<java.util.List<com.golfscores.dtos.Player>> providePlayersAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.JsonAdapter<java.util.List<dtos.TeeTimeData>> provideTeeTimesAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.JsonAdapter<java.util.List<dtos.RoundScoresRawData>> provideScoresAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.JsonAdapter<java.util.List<dtos.ShotlinkTimeData>> provideShotlinkDataAdapter(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi providesMoshi() {
        return null;
    }
}