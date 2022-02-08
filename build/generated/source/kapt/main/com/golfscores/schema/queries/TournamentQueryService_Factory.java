package com.golfscores.schema.queries;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TournamentQueryService_Factory implements Factory<TournamentQueryService> {
  @Override
  public TournamentQueryService get() {
    return newInstance();
  }

  public static TournamentQueryService_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TournamentQueryService newInstance() {
    return new TournamentQueryService();
  }

  private static final class InstanceHolder {
    private static final TournamentQueryService_Factory INSTANCE = new TournamentQueryService_Factory();
  }
}
