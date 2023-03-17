package com.example.crashscheme;

import android.app.Application;

import com.example.crash.CrashHandler;

public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().initialize(this);
    }
}
