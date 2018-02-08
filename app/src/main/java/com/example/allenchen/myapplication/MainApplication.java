package com.example.allenchen.myapplication;

import android.app.Application;

/**
 * Created by ALLENCHEN on 2018/2/8.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        this.registerActivityLifecycleCallbacks(new AppLifecycleCallback());
    }
}
