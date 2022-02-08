package com.golfscores.repositories;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dtos.RoundScoresRawData;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ScoresRepository_Factory implements Factory<ScoresRepository> {
  private final Provider<JsonAdapter<List<RoundScoresRawData>>> scoresAdapterProvider;

  public ScoresRepository_Factory(
      Provider<JsonAdapter<List<RoundScoresRawData>>> scoresAdapterProvider) {
    this.scoresAdapterProvider = scoresAdapterProvider;
  }

  @Override
  public ScoresRepository get() {
    return newInstance(scoresAdapterProvider.get());
  }

  public static ScoresRepository_Factory create(
      Provider<JsonAdapter<List<RoundScoresRawData>>> scoresAdapterProvider) {
    return new ScoresRepository_Factory(scoresAdapterProvider);
  }

  public static ScoresRepository newInstance(JsonAdapter<List<RoundScoresRawData>> scoresAdapter) {
    return new ScoresRepository(scoresAdapter);
  }
}
