package com.example.user.dagger_test.di.module;

import android.app.Activity;
import android.content.Context;

import com.example.user.dagger_test.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by USER on 10/17/2017.
 */

@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    public Context provideContext() {
        return mActivity;
    }

    @Provides
    public Activity provideActivity() {
        return mActivity;
    }
}
