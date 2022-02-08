package com.golfscores

import com.expediagroup.graphql.generator.SchemaGeneratorConfig
import com.expediagroup.graphql.generator.TopLevelObject
import com.expediagroup.graphql.generator.toSchema
import com.golfscores.schema.queries.TournamentQueryService
import graphql.GraphQL

/**
 * Custom logic for how this Ktor server loads all the queries and configuration to create the [GraphQL] object
 * needed to handle incoming requests. In a more enterprise solution you may want to load more things from
 * configuration files instead of hardcoding them.
 */
private val config = SchemaGeneratorConfig(supportedPackages = listOf("com.golfscores"))
private val queries = listOf(
    TopLevelObject(TournamentQueryService()),
)

private val graphQLSchema = toSchema(config, queries)

fun getGraphQLObject(): GraphQL = GraphQL.newGraphQL(graphQLSchema).build()
