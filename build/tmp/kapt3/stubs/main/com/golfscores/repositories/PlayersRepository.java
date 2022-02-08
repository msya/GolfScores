package com.golfscores.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\b\u0007\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/golfscores/repositories/PlayersRepository;", "", "playerJsonsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/golfscores/dtos/Player;", "(Lcom/squareup/moshi/JsonAdapter;)V", "bufferedSource", "Lokio/BufferedSource;", "players", "", "getPlayers", "Companion", "GolfScores"})
public final class PlayersRepository {
    private final com.squareup.moshi.JsonAdapter<java.util.List<com.golfscores.dtos.Player>> playerJsonsAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.golfscores.repositories.PlayersRepository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String JSON_FILE_PATH = "src/main/resources/json.players/players.json";
    private final java.util.List<com.golfscores.dtos.Player> players = null;
    private final okio.BufferedSource bufferedSource = null;
    
    @javax.inject.Inject()
    public PlayersRepository(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonAdapter<java.util.List<com.golfscores.dtos.Player>> playerJsonsAdapter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.golfscores.dtos.Player> getPlayers() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/golfscores/repositories/PlayersRepository$Companion;", "", "()V", "JSON_FILE_PATH", "", "GolfScores"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}