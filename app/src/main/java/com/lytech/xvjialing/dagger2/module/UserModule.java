package com.lytech.xvjialing.dagger2.module;

import android.content.Context;
import android.util.Log;

import com.lytech.xvjialing.dagger2.domain.UserManager;
import com.lytech.xvjialing.dagger2.domain.ApiService;
import com.lytech.xvjialing.dagger2.domain.UserStore;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by xvjialing on 2017/12/3.
 */

//@Module(includes = HttpModule.class)    //以此显示这是一个Module
@Module  //以此显示这是一个Module
public class UserModule {

    private static  final String TAG=UserModule.class.getSimpleName();

    private Context context;

    public UserModule(Context context) {
        this.context = context;
    }

//    @Named("dev")
    @Provides  //告诉Dagger想要构造的对象并提供这个依赖
    public ApiService getApiServiceDev(OkHttpClient okHttpClient){
        Log.d(TAG, "getApiService: dev");
        return new ApiService(okHttpClient);
    }

//    @Named("release")
//    @Provides  //告诉Dagger想要构造的对象并提供这个依赖
//    public ApiService getApiServiceRelease(OkHttpClient okHttpClient){
//        Log.d(TAG, "getApiService: release");
//        return new ApiService(okHttpClient);
//    }


    @Provides
    public UserStore provideUserStore(){
        return new UserStore(this.context);
    }

    @Provides
    public UserManager userManager(ApiService apiService, UserStore userStore){
        Log.d(TAG, "userManager: ");
        return new UserManager(apiService,userStore);
    }
}
