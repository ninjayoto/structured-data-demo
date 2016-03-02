// Code generated by dagger-compiler.  Do not edit.
package com.benjaminwicks.structureddatademo;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class ApplicationModule$$ModuleAdapter extends ModuleAdapter<ApplicationModule> {
  private static final String[] INJECTS = { };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public ApplicationModule$$ModuleAdapter() {
    super(com.benjaminwicks.structureddatademo.ApplicationModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, true /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, ApplicationModule module) {
    bindings.contributeProvidesBinding("@com.benjaminwicks.structureddatademo.ForApplication()/android.content.Context", new ProvideApplicationContextProvidesAdapter(module));
    bindings.contributeProvidesBinding("retrofit2.Retrofit", new ProvideRetrofitProvidesAdapter(module));
  }

  /**
   * A {@code Binding<android.content.Context>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<android.content.Context>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideApplicationContextProvidesAdapter extends ProvidesBinding<android.content.Context>
      implements Provider<android.content.Context> {
    private final ApplicationModule module;

    public ProvideApplicationContextProvidesAdapter(ApplicationModule module) {
      super("@com.benjaminwicks.structureddatademo.ForApplication()/android.content.Context", NOT_SINGLETON, "com.benjaminwicks.structureddatademo.ApplicationModule", "provideApplicationContext");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<android.content.Context>}.
     */
    @Override
    public android.content.Context get() {
      return module.provideApplicationContext();
    }
  }

  /**
   * A {@code Binding<retrofit2.Retrofit>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<retrofit2.Retrofit>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideRetrofitProvidesAdapter extends ProvidesBinding<retrofit2.Retrofit>
      implements Provider<retrofit2.Retrofit> {
    private final ApplicationModule module;

    public ProvideRetrofitProvidesAdapter(ApplicationModule module) {
      super("retrofit2.Retrofit", IS_SINGLETON, "com.benjaminwicks.structureddatademo.ApplicationModule", "provideRetrofit");
      this.module = module;
      setLibrary(true);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<retrofit2.Retrofit>}.
     */
    @Override
    public retrofit2.Retrofit get() {
      return module.provideRetrofit();
    }
  }
}