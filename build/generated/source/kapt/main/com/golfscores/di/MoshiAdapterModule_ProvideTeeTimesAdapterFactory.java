package com.golfscores.di;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dtos.TeeTimeData;
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
public final class MoshiAdapterModule_ProvideTeeTimesAdapterFactory implements Factory<JsonAdapter<List<TeeTimeData>>> {
  private final Provider<Moshi> moshiProvider;

  public MoshiAdapterModule_ProvideTeeTimesAdapterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public JsonAdapter<List<TeeTimeData>> get() {
    return provideTeeTimesAdapter(moshiProvider.get());
  }

  public static MoshiAdapterModule_ProvideTeeTimesAdapterFactory create(
      Provider<Moshi> moshiProvider) {
    return new MoshiAdapterModule_ProvideTeeTimesAdapterFactory(moshiProvider);
  }

  public static JsonAdapter<List<TeeTimeData>> provideTeeTimesAdapter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(MoshiAdapterModule.INSTANCE.provideTeeTimesAdapter(moshi));
  }
}
