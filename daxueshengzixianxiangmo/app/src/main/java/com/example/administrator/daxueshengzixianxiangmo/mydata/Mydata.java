package com.example.administrator.daxueshengzixianxiangmo.mydata;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class Mydata extends FragmentPagerAdapter {
    private ArrayList<String> liste;
    private ArrayList<Fragment> mlist;

    public Mydata(FragmentManager fm, ArrayList<String> liste, ArrayList<Fragment> mlist) {
        super(fm);
        this.liste = liste;
        this.mlist = mlist;
    }

    @Override
    public Fragment getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return liste.get(position);
    }
}
