package com.ns.yc.lifehelper.ui.me.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.ns.yc.lifehelper.R;
import com.ycbjie.library.base.mvp.BaseFragment;
import com.ns.yc.lifehelper.ui.me.view.activity.MePersonActivity;

/**
 * ================================================
 * 描    述：我的个人中心页面
 * ================================================
 */
public class MePersonFragment extends BaseFragment {

    private static final String TYPE = "MePersonFragment";
    private MePersonActivity activity;
    private String mType;

    public static MePersonFragment newInstance(String param) {
        MePersonFragment fragment = new MePersonFragment();
        Bundle args = new Bundle();
        args.putString(TYPE, param);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (MePersonActivity) context;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        activity = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mType = getArguments().getString(TYPE);
        }

    }


    @Override
    public int getContentView() {
        if(mType.equals("first")){
            return R.layout.fragment_me_person_first;
        }
        return R.layout.fragment_me_person_second;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {

    }
}
