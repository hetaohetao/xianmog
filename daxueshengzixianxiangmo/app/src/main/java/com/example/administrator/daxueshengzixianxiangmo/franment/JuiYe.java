package com.example.administrator.daxueshengzixianxiangmo.franment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.administrator.daxueshengzixianxiangmo.R;
import com.example.administrator.daxueshengzixianxiangmo.base.BaseFragment;
import com.example.administrator.daxueshengzixianxiangmo.log.LogModel;
import com.example.administrator.daxueshengzixianxiangmo.log.LogPresenter;
import com.google.gson.Gson;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by Administrator on 2017/11/27 0027.
 */
public class JuiYe extends BaseFragment<LogPresenter,LogModel> {
    private Banner banner;
    private RecyclerView recyclerView;


    @Override
    protected void initView(View view) {
        banner = view.findViewById(R.id.banner);
        recyclerView = view.findViewById(R.id.rv);
        banner.setImages(null)//添加图片集合或图片url集合
                .setDelayTime(2000)//设置轮播时间
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                .setImageLoader(new GlideImage())//加载图片
                .isAutoPlay(false)
                .setIndicatorGravity(BannerConfig.CENTER)//设置指示器位置
                .start();

mPresenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&catid=5&controller=content&action=index&page=1&time=0\n");
    }

    @Override
    public int getLayoutFragment() {
        return R.layout.juiye;
    }

    public class GlideImage extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context.getApplicationContext()).load(path).into(imageView);
        }

    }

    public void show(String result) {
        Gson gson = new Gson();
        JuiYe juiYe = gson.fromJson(result, JuiYe.class);


    }
}
