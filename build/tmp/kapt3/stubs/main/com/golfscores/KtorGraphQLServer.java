package com.golfscores;

import java.lang.System;

/**
 * Helper method for how this Ktor example creates the common [GraphQLServer] object that
 * can handle requests.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/golfscores/KtorGraphQLServer;", "Lcom/expediagroup/graphql/server/execution/GraphQLServer;", "Lio/ktor/request/ApplicationRequest;", "requestParser", "Lcom/golfscores/KtorGraphQLRequestParser;", "contextFactory", "Lcom/golfscores/KtorGraphQLContextFactory;", "requestHandler", "Lcom/expediagroup/graphql/server/execution/GraphQLRequestHandler;", "(Lcom/golfscores/KtorGraphQLRequestParser;Lcom/golfscores/KtorGraphQLContextFactory;Lcom/expediagroup/graphql/server/execution/GraphQLRequestHandler;)V", "GolfScores"})
public final class KtorGraphQLServer extends com.expediagroup.graphql.server.execution.GraphQLServer<io.ktor.request.ApplicationRequest> {
    
    public KtorGraphQLServer(@org.jetbrains.annotations.NotNull()
    com.golfscores.KtorGraphQLRequestParser requestParser, @org.jetbrains.annotations.NotNull()
    com.golfscores.KtorGraphQLContextFactory contextFactory, @org.jetbrains.annotations.NotNull()
    com.expediagroup.graphql.server.execution.GraphQLRequestHandler requestHandler) {
        super(null, null, null);
    }
}