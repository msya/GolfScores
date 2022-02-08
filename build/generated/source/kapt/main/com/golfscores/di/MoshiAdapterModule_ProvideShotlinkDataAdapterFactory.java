package com.golfscores.di;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dtos.ShotlinkTimeData;
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
public final class MoshiAdapterModule_ProvideShotlinkDataAdapterFactory implements Factory<JsonAdapter<List<ShotlinkTimeData>>> {
  private final Provider<Moshi> moshiProvider;

  public MoshiAdapterModule_ProvideShotlinkDataAdapterFactory(Provider<Moshi> moshiProvider) {
    this.moshiProvider = moshiProvider;
  }

  @Override
  public JsonAdapter<List<ShotlinkTimeData>> get() {
    return provideShotlinkDataAdapter(moshiProvider.get());
  }

  public static MoshiAdapterModule_ProvideShotlinkDataAdapterFactory create(
      Provider<Moshi> moshiProvider) {
    return new MoshiAdapterModule_ProvideShotlinkDataAdapterFactory(moshiProvider);
  }

  public static JsonAdapter<List<ShotlinkTimeData>> provideShotlinkDataAdapter(Moshi moshi) {
    return Preconditions.checkNotNullFromProvides(MoshiAdapterModule.INSTANCE.provideShotlinkDataAdapter(moshi));
  }
}
