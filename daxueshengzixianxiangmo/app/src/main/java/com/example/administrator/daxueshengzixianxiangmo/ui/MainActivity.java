package com.example.administrator.daxueshengzixianxiangmo.ui;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.example.administrator.daxueshengzixianxiangmo.R;
import com.example.administrator.daxueshengzixianxiangmo.base.BaseActivity;
import com.example.administrator.daxueshengzixianxiangmo.franment.Huodong;
import com.example.administrator.daxueshengzixianxiangmo.franment.JuiYe;
import com.example.administrator.daxueshengzixianxiangmo.franment.Ketang;
import com.example.administrator.daxueshengzixianxiangmo.franment.Toutian;
import com.example.administrator.daxueshengzixianxiangmo.franment.Xiaoyuan;
import com.example.administrator.daxueshengzixianxiangmo.franment.Yijeiyixuan;
import com.example.administrator.daxueshengzixianxiangmo.log.LogModel;
import com.example.administrator.daxueshengzixianxiangmo.log.LogPresenter;
import com.example.administrator.daxueshengzixianxiangmo.mydata.Mydata;

import java.util.ArrayList;



public class MainActivity extends BaseActivity<LogPresenter, LogModel> implements View.OnClickListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Button button;
    private ArrayList<String> liste;
    private ArrayList<Fragment> mlist=new ArrayList<>();
    private Toutian toutian;
    private JuiYe juiYe;
    private Ketang ketang;
    private Huodong huodong;
    private Xiaoyuan xiaoyuan;
    private Yijeiyixuan yijeiyixuan;

    @Override
    protected void initView() {
        tabLayout= (TabLayout) findViewById(R.id.TabLayout);
        viewPager = (ViewPager) findViewById(R.id.ViewPager);
        button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        liste = new ArrayList<String>();
        toutian=new Toutian();
        juiYe=new JuiYe();
        ketang=new Ketang();
        huodong=new Huodong();
        xiaoyuan=new Xiaoyuan();
        yijeiyixuan=new Yijeiyixuan();
       mlist.add(toutian);
        mlist.add(juiYe);
        mlist.add(ketang);
        mlist.add(huodong);
        mlist.add(xiaoyuan) ;
        mlist.add(yijeiyixuan);
        liste.add("就业");
        liste.add("头条");
        liste.add("活动");
        liste.add("校园");
        liste.add("课堂");
        liste.add("一节一推选");
        Mydata mydata=new Mydata(getSupportFragmentManager(),liste,mlist);
        viewPager.setAdapter(mydata);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:


                break;
        }

    }
}
