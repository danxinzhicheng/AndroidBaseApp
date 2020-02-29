package com.ns.yc.lifehelper.ui.guide.contract;


import android.app.Activity;

import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;
import com.ns.yc.lifehelper.bean.SelectPoint;

import java.util.List;

/**
 *     desc  : 关注点页面
 */
public interface SelectFollowContract {

    interface View extends BaseView {
        void refreshData(List<SelectPoint> list);
        void toMainActivity();
    }

    interface Presenter extends BasePresenter {
        void addData(Activity activity);
    }


}
