package com.golfscores.di;

import com.golfscores.dtos.Player;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class MoshiAdapterModule_ProvidePlayersAdapterFactory implements Factory<JsonAdapter<List<Player>>> {
  private final Provider<Moshi> moshiProvider;

  public MoshiAdapterModule_ProvidePlayersAdapterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public JsonAdapter<List<Player>> get() {
    return providePlayersAdapter(moshiProvider.get());
  }

  public static MoshiAdapterModule_ProvidePlayersAdapterFactory create(
      Provider<Moshi> moshiProvider) {
    return new MoshiAdapterModule_ProvidePlayersAdapterFactory(moshiProvider);
  }

  public static JsonAdapter<List<Player>> providePlayersAdapter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(MoshiAdapterModule.INSTANCE.providePlayersAdapter(moshi));
  }
}
