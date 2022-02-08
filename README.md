# GolfScores

This is a Kotlin GraphQL Server. It was built using [GraphQL Kotlin](https://github.com/ExpediaGroup/graphql-kotlin) library. I
t provides a schema for golf scores and player information.


## GraphQL Queries

```graphql
type Query {

      # Returns get players
      players: [Player!]!

      # Return list of scores
      scores(params: TournamentQueryParametersInput!): [PlayerScoreDisplayData!]!

      # Returns tournament information
      tournamentInfo: TournamentInfo!

      # Returns weather data for time
      weather(params: TournamentQueryParametersInput!): WeatherData!
}
```
