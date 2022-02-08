package com.golfscores;

import java.lang.System;

/**
 * Example of a custom [GraphQLContext]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/golfscores/AuthorizedContext;", "Lcom/expediagroup/graphql/generator/execution/GraphQLContext;", "authorizedUser", "Lcom/golfscores/schema/models/User;", "guestUUID", "", "customHeader", "(Lcom/golfscores/schema/models/User;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorizedUser", "()Lcom/golfscores/schema/models/User;", "getCustomHeader", "()Ljava/lang/String;", "getGuestUUID", "setGuestUUID", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "GolfScores"})
public final class AuthorizedContext implements com.expediagroup.graphql.generator.execution.GraphQLContext {
    @org.jetbrains.annotations.Nullable()
    private final com.golfscores.schema.models.User authorizedUser = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String guestUUID;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String customHeader = null;
    
    /**
     * Example of a custom [GraphQLContext]
     */
    @org.jetbrains.annotations.NotNull()
    public final com.golfscores.AuthorizedContext copy(@org.jetbrains.annotations.Nullable()
    com.golfscores.schema.models.User authorizedUser, @org.jetbrains.annotations.Nullable()
    java.lang.String guestUUID, @org.jetbrains.annotations.Nullable()
    java.lang.String customHeader) {
        return null;
    }
    
    /**
     * Example of a custom [GraphQLContext]
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Example of a custom [GraphQLContext]
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Example of a custom [GraphQLContext]
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AuthorizedContext() {
        super();
    }
    
    public AuthorizedContext(@org.jetbrains.annotations.Nullable()
    com.golfscores.schema.models.User authorizedUser, @org.jetbrains.annotations.Nullable()
    java.lang.String guestUUID, @org.jetbrains.annotations.Nullable()
    java.lang.String customHeader) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.golfscores.schema.models.User component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.golfscores.schema.models.User getAuthorizedUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGuestUUID() {
        return null;
    }
    
    public final void setGuestUUID(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCustomHeader() {
        return null;
    }
}