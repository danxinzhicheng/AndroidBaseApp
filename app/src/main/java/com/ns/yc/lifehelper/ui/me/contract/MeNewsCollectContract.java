package com.ns.yc.lifehelper.ui.me.contract;


import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;
import com.ycbjie.library.db.cache.CacheZhLike;

import java.util.List;

public interface MeNewsCollectContract {

    //View(activity_test/fragment)继承，需要实现的方法
    interface View extends BaseView {
        void showContent(List<CacheZhLike> likeList);
    }

    //Presenter控制器
    interface Presenter extends BasePresenter {
        void getLikeData();
        void deleteLikeData(String id);
        void changeLikeTime(String id, long time, boolean isPlus);
    }


}
