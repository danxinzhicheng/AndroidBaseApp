package com.ns.yc.lifehelper.ui.main.contract;


import com.flyco.tablayout.listener.CustomTabEntity;
import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;

import java.util.ArrayList;



/**
 *     desc  : Main主页面
 */
public interface MainContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter {
        ArrayList<CustomTabEntity> getTabEntity();
        void getUpdate();
    }


}
