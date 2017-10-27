package com.example.user.dagger_test.di.component;

import com.example.user.dagger_test.MainActivity;
import com.example.user.dagger_test.di.PreActivity;
import com.example.user.dagger_test.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by USER on 10/17/2017.
 */
@PreActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
