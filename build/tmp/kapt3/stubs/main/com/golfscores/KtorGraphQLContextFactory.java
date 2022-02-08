package com.golfscores;

import java.lang.System;

/**
 * Custom logic for how this example app should create its context given the [ApplicationRequest]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/golfscores/KtorGraphQLContextFactory;", "Lcom/expediagroup/graphql/server/execution/GraphQLContextFactory;", "Lcom/golfscores/AuthorizedContext;", "Lio/ktor/request/ApplicationRequest;", "()V", "generateContext", "request", "(Lio/ktor/request/ApplicationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GolfScores"})
public final class KtorGraphQLContextFactory implements com.expediagroup.graphql.server.execution.GraphQLContextFactory<com.golfscores.AuthorizedContext, io.ktor.request.ApplicationRequest> {
    
    public KtorGraphQLContextFactory() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object generateContext(@org.jetbrains.annotations.NotNull()
    io.ktor.request.ApplicationRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.golfscores.AuthorizedContext> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object generateContextMap(@org.jetbrains.annotations.NotNull()
    io.ktor.request.ApplicationRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<?, ? extends java.lang.Object>> p1) {
        return null;
    }
}