package com.golfscores.di;

import com.squareup.moshi.Moshi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class MoshiAdapterModule_ProvidesMoshiFactory implements Factory<Moshi> {
  @Override
  public Moshi get() {
    return providesMoshi();
  }

  public static MoshiAdapterModule_ProvidesMoshiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Moshi providesMoshi() {
    return Preconditions.checkNotNullFromProvides(MoshiAdapterModule.INSTANCE.providesMoshi());
  }

  private static final class InstanceHolder {
    private static final MoshiAdapterModule_ProvidesMoshiFactory INSTANCE = new MoshiAdapterModule_ProvidesMoshiFactory();
  }
}
