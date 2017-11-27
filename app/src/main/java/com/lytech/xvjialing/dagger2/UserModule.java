package com.lytech.xvjialing.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xvjialing on 2017/11/25.
 */

@Module
public class UserModule {

    @Provides
    public ApiService provideApiService(){
        return new ApiService();
    }

//    @Provides
//    public UserManager provideUserManager(){
//        return new UserManager();
//    }
}
