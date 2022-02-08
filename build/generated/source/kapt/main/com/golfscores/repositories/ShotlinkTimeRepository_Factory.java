package com.golfscores.repositories;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class ShotlinkTimeRepository_Factory implements Factory<ShotlinkTimeRepository> {
  private final Provider<JsonAdapter<List<ShotlinkTimeData>>> shotlinkTimeAdapterProvider;

  public ShotlinkTimeRepository_Factory(
      Provider<JsonAdapter<List<ShotlinkTimeData>>> shotlinkTimeAdapterProvider) {
    this.shotlinkTimeAdapterProvider = shotlinkTimeAdapterProvider;
  }

  @Override
  public ShotlinkTimeRepository get() {
    return newInstance(shotlinkTimeAdapterProvider.get());
  }

  public static ShotlinkTimeRepository_Factory create(
      Provider<JsonAdapter<List<ShotlinkTimeData>>> shotlinkTimeAdapterProvider) {
    return new ShotlinkTimeRepository_Factory(shotlinkTimeAdapterProvider);
  }

  public static ShotlinkTimeRepository newInstance(
      JsonAdapter<List<ShotlinkTimeData>> shotlinkTimeAdapter) {
    return new ShotlinkTimeRepository(shotlinkTimeAdapter);
  }
}
