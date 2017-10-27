package com.example.user.dagger_test;

import android.app.Application;
import android.content.Context;

import com.example.user.dagger_test.data.DataManager;
import com.example.user.dagger_test.di.component.ApplicationComponent;
import com.example.user.dagger_test.di.component.DaggerApplicationComponent;
import com.example.user.dagger_test.di.module.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by USER on 10/17/2017.
 */

public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;
    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }
}
