package com.ns.yc.lifehelper.ui.guide.contract;


import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;

/**
 * ================================================
 * 描    述：启动页
 * ================================================
 */
public interface GuideContract {

    interface View extends BaseView {
        void showGuideLogo(String logo);
    }

    interface Presenter extends BasePresenter {
        void cacheFindNewsData();
        void cacheFindBottomNewsData();
        void cacheHomePileData();
        void startGuideImage();
    }


}
