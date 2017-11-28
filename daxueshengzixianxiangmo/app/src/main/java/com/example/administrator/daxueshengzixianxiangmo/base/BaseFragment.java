package com.example.administrator.daxueshengzixianxiangmo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.daxueshengzixianxiangmo.utils.Tuitls;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public abstract class BaseFragment <P extends BasePresenter,M extends BaseModel> extends Fragment{
    private View mview;
    public M mModel;
    public P mPresenter;
    private int layoutFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mPresenter = Tuitls.getT(this, 0);
        mModel = Tuitls.getT(this, 1);
        if (this instanceof BaseView) {
            mPresenter.setVM(mModel, this);
        }
        mview = inflater.inflate(getLayoutFragment(), container, false);

        return mview;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(mview);
    }

    protected abstract void initView(View mview);
    public abstract int getLayoutFragment();


}
