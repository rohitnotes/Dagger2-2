package com.lytech.xvjialing.dagger2;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xvjialing on 2017/11/25.
 */

@Module
public class UserModule {

    private static final String TAG=UserModule.class.getSimpleName();

//    @Provides
//    public ApiService provideApiService(){
//        Log.d(TAG, "provide ApiService  ");
//        return new ApiService();
//    }

    @Provides
    public UserManager provideUserManager(ApiService apiService){
        Log.d(TAG, "provide  UserManager");
        return new UserManager(apiService);
    }
}
