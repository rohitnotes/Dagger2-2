package com.lytech.xvjialing.dagger2.module;

/**
 * Created by xvjialing on 2017/12/3.
 */

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * 网络操作Module
 */
@Module
public class HttpModule {

//    @Singleton  //通过这个注解实现OkHttpClient永远都是单例
    @Provides
    public OkHttpClient provideOkHttpClient(){
        return new OkHttpClient().newBuilder().build();
    }
}
