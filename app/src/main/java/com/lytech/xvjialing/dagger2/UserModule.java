package com.lytech.xvjialing.dagger2;

import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xvjialing on 2017/12/3.
 */

@Module    //以此显示这是一个Module
public class UserModule {

    private static  final String TAG=UserModule.class.getSimpleName();

    private Context context;

    public UserModule(Context context) {
        this.context = context;
    }

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
    public UserStore provideUserStore(){
        return new UserStore(this.context);
    }

    @Provides
    public UserManager userManager(ApiService apiService,UserStore userStore){
        Log.d(TAG, "userManager: ");
        return new UserManager(apiService,userStore);
    }
}
