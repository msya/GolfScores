package com.golfscores.schema.queries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/golfscores/schema/queries/TournamentQueryService;", "Lcom/expediagroup/graphql/server/operations/Query;", "()V", "searchBooks", "", "Lcom/golfscores/schema/models/Book;", "params", "Lcom/golfscores/schema/queries/BookSearchParameters;", "GolfScores"})
public final class TournamentQueryService implements com.expediagroup.graphql.server.operations.Query {
    
    @javax.inject.Inject()
    public TournamentQueryService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"unused"})
    @com.expediagroup.graphql.generator.annotations.GraphQLDescription(value = "Return list of scores")
    public final java.util.List<com.golfscores.schema.models.Book> searchBooks(@org.jetbrains.annotations.NotNull()
    com.golfscores.schema.queries.BookSearchParameters params) {
        return null;
    }
}