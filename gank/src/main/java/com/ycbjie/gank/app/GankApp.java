package com.ycbjie.gank.app;

import android.content.Context;

import com.ycbjie.library.base.app.LibApplication;

/**
 * <pre>
 *     desc  : 注意，只有从组件library切换到application才会用到
 *     revise:
 * </pre>
 */
public class GankApp extends LibApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //除了继承LibApplication做公共初始化
        //自己也可以独立做一些初始化
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

}
