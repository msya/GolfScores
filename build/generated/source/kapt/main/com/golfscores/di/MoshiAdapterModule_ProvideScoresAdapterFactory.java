package com.golfscores.di;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class MoshiAdapterModule_ProvideScoresAdapterFactory implements Factory<JsonAdapter<List<RoundScoresRawData>>> {
  private final Provider<Moshi> moshiProvider;

  public MoshiAdapterModule_ProvideScoresAdapterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public JsonAdapter<List<RoundScoresRawData>> get() {
    return provideScoresAdapter(moshiProvider.get());
  }

  public static MoshiAdapterModule_ProvideScoresAdapterFactory create(
      Provider<Moshi> moshiProvider) {
    return new MoshiAdapterModule_ProvideScoresAdapterFactory(moshiProvider);
  }

  public static JsonAdapter<List<RoundScoresRawData>> provideScoresAdapter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(MoshiAdapterModule.INSTANCE.provideScoresAdapter(moshi));
  }
}
