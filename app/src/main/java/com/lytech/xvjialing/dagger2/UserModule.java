package com.lytech.xvjialing.dagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xvjialing on 2017/12/3.
 */

@Module    //以此显示这是一个Module
public class UserModule {

    private static  final String TAG=UserModule.class.getSimpleName();

//    @Provides  //告诉Dagger想要构造的对象并提供这个依赖
//    public ApiService getApiService(){
//        Log.d(TAG, "getApiService: ");
//        return new ApiService();
//    }

    @Provides
    public String url(){
        return "www.test.com";
    }

    @Provides
    public UserManager userManager(ApiService apiService){
        Log.d(TAG, "userManager: ");
        return new UserManager(apiService);
    }
}
