package com.golfscores;

import java.lang.System;

/**
 * The Ktor specific code to handle incoming [ApplicationCall]s, send them to GraphQL,
 * and then format and send a correct response back.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/golfscores/KtorServer;", "", "()V", "ktorGraphQLServer", "Lcom/golfscores/KtorGraphQLServer;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "handle", "", "applicationCall", "Lio/ktor/application/ApplicationCall;", "(Lio/ktor/application/ApplicationCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GolfScores"})
public final class KtorServer {
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private final com.golfscores.KtorGraphQLServer ktorGraphQLServer = null;
    
    public KtorServer() {
        super();
    }
    
    /**
     * Handle incoming Ktor Http requests and send them back to the response methods.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object handle(@org.jetbrains.annotations.NotNull()
    io.ktor.application.ApplicationCall applicationCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}