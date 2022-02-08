package com.golfscores.repositories;

import com.golfscores.dtos.Player;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class PlayersRepository_Factory implements Factory<PlayersRepository> {
  private final Provider<JsonAdapter<List<Player>>> playerJsonsAdapterProvider;

  public PlayersRepository_Factory(Provider<JsonAdapter<List<Player>>> playerJsonsAdapterProvider) {
    this.playerJsonsAdapterProvider = playerJsonsAdapterProvider;
  }

  @Override
  public PlayersRepository get() {
    return newInstance(playerJsonsAdapterProvider.get());
  }

  public static PlayersRepository_Factory create(
      Provider<JsonAdapter<List<Player>>> playerJsonsAdapterProvider) {
    return new PlayersRepository_Factory(playerJsonsAdapterProvider);
  }

  public static PlayersRepository newInstance(JsonAdapter<List<Player>> playerJsonsAdapter) {
    return new PlayersRepository(playerJsonsAdapter);
  }
}
