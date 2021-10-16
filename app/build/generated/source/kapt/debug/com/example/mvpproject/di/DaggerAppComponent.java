// Generated by Dagger (https://dagger.dev).
package com.example.mvpproject.di;

import android.app.Application;
import com.example.mvpproject.di.modules.ApplicationModule;
import com.example.mvpproject.di.modules.ApplicationModule_ProvidesApplicationFactory;
import com.example.mvpproject.di.modules.DataBaseModule;
import com.example.mvpproject.di.modules.DataBaseModule_ProvideUserDaoFactory;
import com.example.mvpproject.di.modules.DataBaseModule_ProvideUserDataBaseFactory;
import com.example.mvpproject.di.modules.MainActivityModule;
import com.example.mvpproject.di.modules.PresenterModule;
import com.example.mvpproject.di.modules.PresenterModule_ProvideLoginPresenterFactory;
import com.example.mvpproject.di.modules.PresenterModule_ProvideRegistrationPresenterFactory;
import com.example.mvpproject.di.modules.RepositoryModule;
import com.example.mvpproject.di.modules.RepositoryModule_ProvideLoginRepositoryFactory;
import com.example.mvpproject.di.modules.RouterModule;
import com.example.mvpproject.di.modules.RouterModule_ProvideCiceroneFactory;
import com.example.mvpproject.di.modules.RouterModule_ProvideNavigatorFactory;
import com.example.mvpproject.di.modules.RouterModule_ProvideRouterFactory;
import com.example.mvpproject.domain.LoginRepository;
import com.example.mvpproject.domain.Storage.UserDao;
import com.example.mvpproject.domain.Storage.UserDataBase;
import com.example.mvpproject.ui.MainActivity;
import com.example.mvpproject.ui.MainActivity_MembersInjector;
import com.example.mvpproject.ui.login.LoginContract;
import com.example.mvpproject.ui.login.LoginFragment;
import com.example.mvpproject.ui.login.LoginFragment_MembersInjector;
import com.example.mvpproject.ui.registration.RegistrationContract;
import com.example.mvpproject.ui.registration.RegistrationFragment;
import com.example.mvpproject.ui.registration.RegistrationFragment_MembersInjector;
import com.github.terrakok.cicerone.Cicerone;
import com.github.terrakok.cicerone.NavigatorHolder;
import com.github.terrakok.cicerone.Router;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final RouterModule routerModule;

  private final RepositoryModule repositoryModule;

  private final DataBaseModule dataBaseModule;

  private Provider<Cicerone<Router>> provideCiceroneProvider;

  private Provider<Application> providesApplicationProvider;

  private Provider<UserDataBase> provideUserDataBaseProvider;

  private DaggerAppComponent(RepositoryModule repositoryModuleParam,
      ApplicationModule applicationModuleParam, DataBaseModule dataBaseModuleParam,
      RouterModule routerModuleParam) {
    this.routerModule = routerModuleParam;
    this.repositoryModule = repositoryModuleParam;
    this.dataBaseModule = dataBaseModuleParam;
    initialize(repositoryModuleParam, applicationModuleParam, dataBaseModuleParam, routerModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  private Router router() {
    return RouterModule_ProvideRouterFactory.provideRouter(routerModule, provideCiceroneProvider.get());
  }

  private NavigatorHolder navigatorHolder() {
    return RouterModule_ProvideNavigatorFactory.provideNavigator(routerModule, provideCiceroneProvider.get());
  }

  private UserDao userDao() {
    return DataBaseModule_ProvideUserDaoFactory.provideUserDao(dataBaseModule, provideUserDataBaseProvider.get());
  }

  private LoginRepository loginRepository() {
    return RepositoryModule_ProvideLoginRepositoryFactory.provideLoginRepository(repositoryModule, userDao());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final RepositoryModule repositoryModuleParam,
      final ApplicationModule applicationModuleParam, final DataBaseModule dataBaseModuleParam,
      final RouterModule routerModuleParam) {
    this.provideCiceroneProvider = DoubleCheck.provider(RouterModule_ProvideCiceroneFactory.create(routerModuleParam));
    this.providesApplicationProvider = ApplicationModule_ProvidesApplicationFactory.create(applicationModuleParam);
    this.provideUserDataBaseProvider = DoubleCheck.provider(DataBaseModule_ProvideUserDataBaseFactory.create(dataBaseModuleParam, providesApplicationProvider));
  }

  @Override
  public MainSubcomponent.Factory getMainSubcomponent() {
    return new MainSubcomponentFactory();
  }

  public static final class Builder {
    private RepositoryModule repositoryModule;

    private ApplicationModule applicationModule;

    private DataBaseModule dataBaseModule;

    private RouterModule routerModule;

    private Builder() {
    }

    public Builder repositoryModule(RepositoryModule repositoryModule) {
      this.repositoryModule = Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    public Builder applicationModule(ApplicationModule applicationModule) {
      this.applicationModule = Preconditions.checkNotNull(applicationModule);
      return this;
    }

    public Builder dataBaseModule(DataBaseModule dataBaseModule) {
      this.dataBaseModule = Preconditions.checkNotNull(dataBaseModule);
      return this;
    }

    public Builder routerModule(RouterModule routerModule) {
      this.routerModule = Preconditions.checkNotNull(routerModule);
      return this;
    }

    public AppComponent build() {
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      Preconditions.checkBuilderRequirement(applicationModule, ApplicationModule.class);
      if (dataBaseModule == null) {
        this.dataBaseModule = new DataBaseModule();
      }
      if (routerModule == null) {
        this.routerModule = new RouterModule();
      }
      return new DaggerAppComponent(repositoryModule, applicationModule, dataBaseModule, routerModule);
    }
  }

  private final class MainSubcomponentFactory implements MainSubcomponent.Factory {
    @Override
    public MainSubcomponent create(MainActivityModule mainActivityModule) {
      Preconditions.checkNotNull(mainActivityModule);
      return new MainSubcomponentImpl(new PresenterModule());
    }
  }

  private final class MainSubcomponentImpl implements MainSubcomponent {
    private final PresenterModule presenterModule;

    private MainSubcomponentImpl(PresenterModule presenterModuleParam) {
      this.presenterModule = presenterModuleParam;
    }

    private LoginContract.Presenter presenter() {
      return PresenterModule_ProvideLoginPresenterFactory.provideLoginPresenter(presenterModule, DaggerAppComponent.this.loginRepository(), DaggerAppComponent.this.router());
    }

    private RegistrationContract.Presenter presenter2() {
      return PresenterModule_ProvideRegistrationPresenterFactory.provideRegistrationPresenter(presenterModule, DaggerAppComponent.this.loginRepository());
    }

    @Override
    public void injectMainActivity(MainActivity activity) {
      injectMainActivity2(activity);
    }

    @Override
    public void injectLoginFragment(LoginFragment loginFragment) {
      injectLoginFragment2(loginFragment);
    }

    @Override
    public void inject(RegistrationFragment registrationFragment) {
      injectRegistrationFragment(registrationFragment);
    }

    private MainActivity injectMainActivity2(MainActivity instance) {
      MainActivity_MembersInjector.injectRouter(instance, DaggerAppComponent.this.router());
      MainActivity_MembersInjector.injectNavigatorHolder(instance, DaggerAppComponent.this.navigatorHolder());
      return instance;
    }

    private LoginFragment injectLoginFragment2(LoginFragment instance) {
      LoginFragment_MembersInjector.injectPresenterMoxy(instance, presenter());
      return instance;
    }

    private RegistrationFragment injectRegistrationFragment(RegistrationFragment instance) {
      RegistrationFragment_MembersInjector.injectPresenterMoxy(instance, presenter2());
      return instance;
    }
  }
}