package com.golfscores.di;

import dagger.internal.DaggerGenerated;
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
public final class DaggerApplicationComponent implements ApplicationComponent {
  private final DaggerApplicationComponent applicationComponent = this;

  private DaggerApplicationComponent() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder moshiAdapterModule(MoshiAdapterModule moshiAdapterModule) {
      Preconditions.checkNotNull(moshiAdapterModule);
      return this;
    }

    public ApplicationComponent build() {
      return new DaggerApplicationComponent();
    }
  }
}
