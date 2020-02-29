package com.ns.yc.lifehelper.ui.data.contract;


import com.ns.yc.lifehelper.bean.ImageIconBean;
import com.ycbjie.library.base.mvp.BasePresenter;
import com.ycbjie.library.base.mvp.BaseView;

import java.util.ArrayList;
import java.util.List;


public interface DataFragmentContract {

    interface View extends BaseView {
        void setGridView(String[] toolName, ArrayList<Integer> logoList);
        void setRecycleView(ArrayList<Integer> list);
    }

    interface Presenter extends BasePresenter {
        List<ImageIconBean> getVpData();
        void initGridViewData();
        void initRecycleViewData();
    }


}
