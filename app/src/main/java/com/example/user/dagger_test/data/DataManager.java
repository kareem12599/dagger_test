package com.example.user.dagger_test.data;

import android.content.Context;
import android.content.res.Resources;

import com.example.user.dagger_test.data.model.User;
import com.example.user.dagger_test.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by USER on 10/17/2017.
 */
@Singleton
public class DataManager {
    private Context mContext;
    private DbHelper mDbHelper;
    private SharedPrefHelper mSharedPrefHelper;

    @Inject
    public DataManager(@ApplicationContext Context mContext,
                       DbHelper mDbHelper,
                       SharedPrefHelper mSharedPrefHelper) {
        this.mContext = mContext;
        this.mDbHelper = mDbHelper;
        this.mSharedPrefHelper = mSharedPrefHelper;
    }

    public void saveAccessToken(String accessToken) {
        mSharedPrefHelper.put(SharedPrefHelper.PREF_KEY_ACCESS_TOKEN, accessToken);
    }

    public String getAccessToken() {
        return mSharedPrefHelper.get(SharedPrefHelper.PREF_KEY_ACCESS_TOKEN, null);
    }

    public Long createUser(User user) throws Exception {
        return mDbHelper.insertUser(user);
    }

    public User getUser(Long userId) throws Resources.NotFoundException, NullPointerException {
        return mDbHelper.getUser(userId);
    }
}
