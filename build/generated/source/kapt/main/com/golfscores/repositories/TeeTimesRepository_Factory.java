package com.golfscores.repositories;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class TeeTimesRepository_Factory implements Factory<TeeTimesRepository> {
  private final Provider<JsonAdapter<List<TeeTimeData>>> teeTimesAdapterProvider;

  public TeeTimesRepository_Factory(
      Provider<JsonAdapter<List<TeeTimeData>>> teeTimesAdapterProvider) {
    this.teeTimesAdapterProvider = teeTimesAdapterProvider;
  }

  @Override
  public TeeTimesRepository get() {
    return newInstance(teeTimesAdapterProvider.get());
  }

  public static TeeTimesRepository_Factory create(
      Provider<JsonAdapter<List<TeeTimeData>>> teeTimesAdapterProvider) {
    return new TeeTimesRepository_Factory(teeTimesAdapterProvider);
  }

  public static TeeTimesRepository newInstance(JsonAdapter<List<TeeTimeData>> teeTimesAdapter) {
    return new TeeTimesRepository(teeTimesAdapter);
  }
}
