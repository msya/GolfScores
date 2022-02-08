package com.golfscores.schema;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/golfscores/schema/UniversityQueryService;", "Lcom/expediagroup/graphql/server/operations/Query;", "()V", "searchUniversities", "", "Lcom/golfscores/schema/models/University;", "params", "Lcom/golfscores/schema/UniversitySearchParameters;", "(Lcom/golfscores/schema/UniversitySearchParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GolfScores"})
public final class UniversityQueryService implements com.expediagroup.graphql.server.operations.Query {
    
    public UniversityQueryService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Throws(exceptionClasses = {graphql.GraphQLException.class})
    public final java.lang.Object searchUniversities(@org.jetbrains.annotations.NotNull()
    com.golfscores.schema.UniversitySearchParameters params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.golfscores.schema.models.University>> continuation) {
        return null;
    }
}