package me.jessyan.progressmanager.demo;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;

import java.io.InputStream;

/**
 * Created by jess on 06/06/2017 16:41
 * Contact with jess.yan.effort@gmail.com
 */

public class GlideConfiguration implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        BaseApplication application = (BaseApplication) context.getApplicationContext();
        glide.register(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(application.getOkHttpClient()));
    }
}