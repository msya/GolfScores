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
public final class JodaDateTimeAdapter_Factory implements Factory<JodaDateTimeAdapter> {
  @Override
  public JodaDateTimeAdapter get() {
    return newInstance();
  }

  public static JodaDateTimeAdapter_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JodaDateTimeAdapter newInstance() {
    return new JodaDateTimeAdapter();
  }

  private static final class InstanceHolder {
    private static final JodaDateTimeAdapter_Factory INSTANCE = new JodaDateTimeAdapter_Factory();
  }
}
