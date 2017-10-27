package com.example.user.dagger_test.di.component;

import android.app.Application;
import android.content.Context;

import com.example.user.dagger_test.DemoApplication;
import com.example.user.dagger_test.data.DataManager;
import com.example.user.dagger_test.data.DbHelper;
import com.example.user.dagger_test.data.SharedPrefHelper;
import com.example.user.dagger_test.di.ApplicationContext;
import com.example.user.dagger_test.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by USER on 10/17/2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefHelper getSharedPrefHelper();

    DbHelper getDbHelper();
}
