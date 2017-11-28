package com.example.administrator.daxueshengzixianxiangmo.log;

import com.example.administrator.daxueshengzixianxiangmo.base.BaseModel;
import com.example.administrator.daxueshengzixianxiangmo.base.BasePresenter;
import com.example.administrator.daxueshengzixianxiangmo.base.BaseView;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public interface LogContract {

    interface View extends BaseView {
        void show(String result);
      
    }

    interface Model extends BaseModel {
        void getDataFromModel(String url,Callbacks callbacks);
        
    }

    abstract static class Presenter extends BasePresenter<Model, View> {
        public void onStart(){

        }
        public  abstract void getDataFromModel(String url);

    }

}