package com.example.administrator.daxueshengzixianxiangmo.base;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public abstract class BasePresenter<M,V> {
    public M baseModel;
    public V baseView;
    public void setVM(M m,V v){
        baseModel=m;
        baseView=v;

    }
    public abstract void onStart();
}
