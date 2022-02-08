package com.golfscores;

import java.lang.System;

/**
 * Custom logic for how Ktor parses the incoming [ApplicationRequest] into the [GraphQLServerRequest]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/golfscores/KtorGraphQLRequestParser;", "Lcom/expediagroup/graphql/server/execution/GraphQLRequestParser;", "Lio/ktor/request/ApplicationRequest;", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "(Lcom/fasterxml/jackson/databind/ObjectMapper;)V", "parseRequest", "Lcom/expediagroup/graphql/server/types/GraphQLServerRequest;", "request", "(Lio/ktor/request/ApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GolfScores"})
public final class KtorGraphQLRequestParser implements com.expediagroup.graphql.server.execution.GraphQLRequestParser<io.ktor.request.ApplicationRequest> {
    private final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    
    public KtorGraphQLRequestParser(@org.jetbrains.annotations.NotNull()
    com.fasterxml.jackson.databind.ObjectMapper mapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"BlockingMethodInNonBlockingContext"})
    @java.lang.Override()
    public java.lang.Object parseRequest(@org.jetbrains.annotations.NotNull()
    io.ktor.request.ApplicationRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.expediagroup.graphql.server.types.GraphQLServerRequest> continuation) {
        return null;
    }
}