// Generated by Dagger (https://dagger.dev).
package com.example.mvpproject.di.modules;

import com.example.mvpproject.domain.Storage.UserDao;
import com.example.mvpproject.domain.Storage.UserDataBase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataBaseModule_ProvideUserDaoFactory implements Factory<UserDao> {
  private final DataBaseModule module;

  private final Provider<UserDataBase> dataBaseProvider;

  public DataBaseModule_ProvideUserDaoFactory(DataBaseModule module,
      Provider<UserDataBase> dataBaseProvider) {
    this.module = module;
    this.dataBaseProvider = dataBaseProvider;
  }

  @Override
  public UserDao get() {
    return provideUserDao(module, dataBaseProvider.get());
  }

  public static DataBaseModule_ProvideUserDaoFactory create(DataBaseModule module,
      Provider<UserDataBase> dataBaseProvider) {
    return new DataBaseModule_ProvideUserDaoFactory(module, dataBaseProvider);
  }

  public static UserDao provideUserDao(DataBaseModule instance, UserDataBase dataBase) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserDao(dataBase));
  }
}
