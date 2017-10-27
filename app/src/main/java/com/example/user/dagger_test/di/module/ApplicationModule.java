package com.example.user.dagger_test.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.user.dagger_test.di.ApplicationContext;
import com.example.user.dagger_test.di.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by USER on 10/17/2017.
 */
@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    public Context provideContext() {
        return mApplication;
    }

    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String prvoideDatabaseName() {
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    public SharedPreferences proviedSharedPref() {
        return mApplication.getSharedPreferences("demo-pref", Context.MODE_PRIVATE);
    }
}
