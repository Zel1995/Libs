// Generated by Dagger (https://dagger.dev).
package com.example.mvpproject.di.modules;

import com.github.terrakok.cicerone.Cicerone;
import com.github.terrakok.cicerone.NavigatorHolder;
import com.github.terrakok.cicerone.Router;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RouterModule_ProvideNavigatorFactory implements Factory<NavigatorHolder> {
  private final RouterModule module;

  private final Provider<Cicerone<Router>> ciceroneProvider;

  public RouterModule_ProvideNavigatorFactory(RouterModule module,
      Provider<Cicerone<Router>> ciceroneProvider) {
    this.module = module;
    this.ciceroneProvider = ciceroneProvider;
  }

  @Override
  public NavigatorHolder get() {
    return provideNavigator(module, ciceroneProvider.get());
  }

  public static RouterModule_ProvideNavigatorFactory create(RouterModule module,
      Provider<Cicerone<Router>> ciceroneProvider) {
    return new RouterModule_ProvideNavigatorFactory(module, ciceroneProvider);
  }

  public static NavigatorHolder provideNavigator(RouterModule instance, Cicerone<Router> cicerone) {
    return Preconditions.checkNotNullFromProvides(instance.provideNavigator(cicerone));
  }
}