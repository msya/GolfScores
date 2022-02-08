package com.golfscores.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/golfscores/repositories/ScoresRepository;", "", "scoresAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Ldtos/RoundScoresRawData;", "(Lcom/squareup/moshi/JsonAdapter;)V", "scores", "", "getMissedCutPlayers", "", "getScores", "round", "Ldtos/ROUND;", "Companion", "GolfScores"})
public final class ScoresRepository {
    private final com.squareup.moshi.JsonAdapter<java.util.List<dtos.RoundScoresRawData>> scoresAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.golfscores.repositories.ScoresRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROUND_1_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_1_scores.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROUND_2_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_2_scores.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROUND_3_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_3_scores.json";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ROUND_4_SCORES_CSV_FILE_PATH = "src/main/resources/scores/masters_2019_round_4_scores.json";
    private final java.util.List<dtos.RoundScoresRawData> scores = null;
    
    @javax.inject.Inject()
    public ScoresRepository(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<java.util.List<dtos.RoundScoresRawData>> scoresAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<dtos.RoundScoresRawData> getScores(@org.jetbrains.annotations.NotNull()
    dtos.ROUND round) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getMissedCutPlayers() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/golfscores/repositories/ScoresRepository$Companion;", "", "()V", "ROUND_1_SCORES_CSV_FILE_PATH", "", "ROUND_2_SCORES_CSV_FILE_PATH", "ROUND_3_SCORES_CSV_FILE_PATH", "ROUND_4_SCORES_CSV_FILE_PATH", "GolfScores"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}