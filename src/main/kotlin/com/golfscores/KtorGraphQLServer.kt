package com.golfscores

import com.expediagroup.graphql.server.execution.GraphQLRequestHandler
import com.expediagroup.graphql.server.execution.GraphQLServer
import com.fasterxml.jackson.databind.ObjectMapper
import io.ktor.request.ApplicationRequest

/**
 * Helper method for how this Ktor example creates the common [GraphQLServer] object that
 * can handle requests.
 */
class KtorGraphQLServer(
    requestParser: KtorGraphQLRequestParser,
    contextFactory: KtorGraphQLContextFactory,
    requestHandler: GraphQLRequestHandler
) : GraphQLServer<ApplicationRequest>(requestParser, contextFactory, requestHandler)

fun getGraphQLServer(mapper: ObjectMapper): KtorGraphQLServer {
    val dataLoaderRegistryFactory = KtorDataLoaderRegistryFactory()
    val requestParser = KtorGraphQLRequestParser(mapper)
    val contextFactory = KtorGraphQLContextFactory()
    val graphQL = getGraphQLObject()
    val requestHandler = GraphQLRequestHandler(graphQL, dataLoaderRegistryFactory)

    return KtorGraphQLServer(requestParser, contextFactory, requestHandler)
}
