// Generated by Dagger (https://dagger.dev).
package com.example.mvpproject.di.modules;

import com.example.mvpproject.domain.LoginRepository;
import com.example.mvpproject.ui.login.LoginContract;
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
public final class PresenterModule_ProvideLoginPresenterFactory implements Factory<LoginContract.Presenter> {
  private final PresenterModule module;

  private final Provider<LoginRepository> repositoryProvider;

  private final Provider<Router> routerProvider;

  public PresenterModule_ProvideLoginPresenterFactory(PresenterModule module,
      Provider<LoginRepository> repositoryProvider, Provider<Router> routerProvider) {
    this.module = module;
    this.repositoryProvider = repositoryProvider;
    this.routerProvider = routerProvider;
  }

  @Override
  public LoginContract.Presenter get() {
    return provideLoginPresenter(module, repositoryProvider.get(), routerProvider.get());
  }

  public static PresenterModule_ProvideLoginPresenterFactory create(PresenterModule module,
      Provider<LoginRepository> repositoryProvider, Provider<Router> routerProvider) {
    return new PresenterModule_ProvideLoginPresenterFactory(module, repositoryProvider, routerProvider);
  }

  public static LoginContract.Presenter provideLoginPresenter(PresenterModule instance,
      LoginRepository repository, Router router) {
    return Preconditions.checkNotNullFromProvides(instance.provideLoginPresenter(repository, router));
  }
}