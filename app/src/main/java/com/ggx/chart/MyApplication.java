package com.ggx.chart;

import android.app.Application;

/**
 * Created by John on 2016/4/11.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(getApplicationContext());
    }
}
