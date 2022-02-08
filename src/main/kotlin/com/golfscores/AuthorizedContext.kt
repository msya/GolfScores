package com.golfscores

import com.expediagroup.graphql.generator.execution.GraphQLContext

/**
 * Example of a custom [GraphQLContext]
 */
data class AuthorizedContext(
    var guestUUID: String? = null,
    val customHeader: String? = null
) : GraphQLContext
