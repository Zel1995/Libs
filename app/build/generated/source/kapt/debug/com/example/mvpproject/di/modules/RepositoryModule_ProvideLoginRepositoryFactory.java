// Generated by Dagger (https://dagger.dev).
package com.example.mvpproject.di.modules;

import com.example.mvpproject.domain.LoginRepository;
import com.example.mvpproject.domain.Storage.UserDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideLoginRepositoryFactory implements Factory<LoginRepository> {
  private final RepositoryModule module;

  private final Provider<UserDao> userDaoProvider;

  public RepositoryModule_ProvideLoginRepositoryFactory(RepositoryModule module,
      Provider<UserDao> userDaoProvider) {
    this.module = module;
    this.userDaoProvider = userDaoProvider;
  }

  @Override
  public LoginRepository get() {
    return provideLoginRepository(module, userDaoProvider.get());
  }

  public static RepositoryModule_ProvideLoginRepositoryFactory create(RepositoryModule module,
      Provider<UserDao> userDaoProvider) {
    return new RepositoryModule_ProvideLoginRepositoryFactory(module, userDaoProvider);
  }

  public static LoginRepository provideLoginRepository(RepositoryModule instance, UserDao userDao) {
    return Preconditions.checkNotNullFromProvides(instance.provideLoginRepository(userDao));
  }
}
