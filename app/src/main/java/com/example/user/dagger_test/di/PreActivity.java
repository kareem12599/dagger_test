package com.example.user.dagger_test.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by USER on 10/17/2017.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PreActivity {
}
