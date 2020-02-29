package com.ns.yc.lifehelper.base.app;

import android.util.Log;

import com.ycbjie.library.base.app.LibApplication;


/**
 *     desc         Application
 */
public class BaseApplication extends LibApplication {

    /**
     * 程序启动的时候执行
     */
    @Override
    public void onCreate() {
        Log.d("Application", "onCreate");
        super.onCreate();
    }


}


