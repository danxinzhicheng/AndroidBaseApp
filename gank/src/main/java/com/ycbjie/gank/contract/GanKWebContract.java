package com.ycbjie.gank.contract;


import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;
import com.ycbjie.gank.bean.cache.CacheGanKFavorite;

/**
 * ================================================
 * 描    述：干货集中营详情页面桥梁
 * ================================================
 */
public interface GanKWebContract {

    //View(activity_test/fragment)继承，需要实现的方法
    interface View extends BaseView {
        //设置fab按钮的颜色
        void setFabColor();
        //获取收藏序列化内存
        CacheGanKFavorite getFavoriteData();
        //获取加载url
        String getLoadUrl();
        //加载内容
        void loadURL(String url);
        //设置收藏的状态
        void setFavoriteState(boolean isFavorite);
        //隐藏fab按钮
        void hideFavoriteFab();
    }

    //Presenter控制器
    interface Presenter extends BasePresenter {
        //处理收藏的逻辑
        void meFavorite();
    }


}
