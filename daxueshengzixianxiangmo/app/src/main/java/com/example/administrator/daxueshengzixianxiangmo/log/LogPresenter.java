package com.example.administrator.daxueshengzixianxiangmo.log;

/**
* Created by TMVPHelper on 2017/11/27
*/
public class LogPresenter extends LogContract.Presenter{
    @Override
    public void getDataFromModel(String url) {
     baseModel.getDataFromModel(url, new Callbacks() {
         @Override
         public void succ(String result) {
             baseView.show(result);
         }
     });
    }
}