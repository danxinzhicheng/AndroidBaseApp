package com.ns.yc.lifehelper.ui.home.contract;


import android.graphics.Bitmap;

import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;
import com.ycbjie.library.model.HomeBlogEntity;
import com.ns.yc.lifehelper.ui.main.view.MainActivity;

import java.util.ArrayList;
import java.util.List;


/**
 * ================================================
 * 描    述：Home主页面
 *       v1.5 修改于11月3日，改写代码为MVP架构
 * ================================================
 */
public interface HomeFragmentContract {

    interface View extends BaseView {
        void setNewsData(List<HomeBlogEntity> list);
        void downloadBitmapSuccess(ArrayList<Bitmap> bitmapList);
    }

    interface Presenter extends BasePresenter {
        void getHomeNewsData();
        ArrayList<String> getMarqueeTitle();
        List<Object> getBannerData();
        void bindActivity(MainActivity activity);
        void getGalleryData();
    }


}
