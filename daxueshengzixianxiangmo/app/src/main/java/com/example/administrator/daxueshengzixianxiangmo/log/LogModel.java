package com.example.administrator.daxueshengzixianxiangmo.log;

import com.example.administrator.daxueshengzixianxiangmo.App;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
* Created by TMVPHelper on 2017/11/27
*/
public class LogModel implements LogContract.Model{
public static LogModel logModel;
    public static OkHttpClient okHttpClient;
public static LogModel getInstance(){
    if (logModel == null) {
        synchronized (LogModel.class){
            logModel=new LogModel();
        }
    }
    return logModel;
}
    public LogModel(){
        okHttpClient=new OkHttpClient();
    }
    @Override
    public void getDataFromModel(String url, final Callbacks callbacks) {
        Request request=new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
           final String  string=response.body().string();
                App.baseActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callbacks.succ(string);
                    }
                });
            }
        });

    }
}