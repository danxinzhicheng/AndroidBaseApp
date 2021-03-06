package com.ns.yc.lifehelper.ui.me.presenter;

import com.ns.yc.lifehelper.ui.me.contract.MeNewsCollectContract;
import com.ycbjie.library.db.realm.RealmDbHelper;

import rx.subscriptions.CompositeSubscription;

public class MeNewsCollectPresenter implements MeNewsCollectContract.Presenter {

    private MeNewsCollectContract.View mView;
    private CompositeSubscription mSubscriptions;


    public MeNewsCollectPresenter(MeNewsCollectContract.View androidView) {
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


    @Override
    public void deleteLikeData(String id) {
        RealmDbHelper.getInstance().deleteLikeBean(id);
    }

    @Override
    public void changeLikeTime(String id, long time, boolean isPlus) {
        RealmDbHelper.getInstance().changeLikeTime(id,time,isPlus);
    }


    @Override
    public void getLikeData() {
        mView.showContent(RealmDbHelper.getInstance().getLikeList());
    }
}
