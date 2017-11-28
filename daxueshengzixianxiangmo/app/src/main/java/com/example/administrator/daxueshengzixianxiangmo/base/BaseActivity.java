package com.example.administrator.daxueshengzixianxiangmo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.daxueshengzixianxiangmo.App;
import com.example.administrator.daxueshengzixianxiangmo.utils.Tuitls;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity {
    public P mPresenter;
    public  M mModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        App.baseActivity=this;
        mPresenter= Tuitls.getT(this,0);
        mModel=Tuitls.getT(this,1);
        initView();



    }



    protected abstract void initView();

    public abstract int getLayoutId();
}
