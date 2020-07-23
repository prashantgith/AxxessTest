package com.prashant.axxesstest.app;

import android.app.Application;

public class AppSingleton extends Application
{

    public static final String TAG = AppSingleton.class
            .getSimpleName();
    private static AppSingleton mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }

    public AppSingleton() {

    }

    public static synchronized AppSingleton getInstance() {
        if (mInstance == null) {
            mInstance = new AppSingleton();
        }

        return mInstance;
    }

}


