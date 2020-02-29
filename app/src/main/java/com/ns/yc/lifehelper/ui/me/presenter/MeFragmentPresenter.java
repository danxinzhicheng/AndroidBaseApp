package com.ns.yc.lifehelper.ui.me.presenter;

import com.ns.yc.lifehelper.ui.me.contract.MeFragmentContract;

import rx.subscriptions.CompositeSubscription;

/**
 *     desc  : 我的页面
 */
public class MeFragmentPresenter implements MeFragmentContract.Presenter {

    private MeFragmentContract.View mView;
    private CompositeSubscription mSubscriptions;


    public MeFragmentPresenter(MeFragmentContract.View androidView) {
        this.mView = androidView;
        mSubscriptions = new CompositeSubscription();
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unSubscribe() {
        mSubscriptions.unsubscribe();
    }

    /**
     * 获取消息数据，我的收藏，问题，控件，如果有消息则显示红点
     */
    @Override
    public void getRedHotMessageData() {

    }
}
