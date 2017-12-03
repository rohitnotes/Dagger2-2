package com.lytech.xvjialing.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xvjialing on 2017/12/3.
 */

@Module    //以此显示这是一个Module
public class UserModule {

    @Provides  //告诉Dagger想要构造的对象并提供这个依赖
    public ApiService getApiService(){
        return new ApiService();
    }

    @Provides
    public UserManager userManager(ApiService apiService){
        return new UserManager(apiService);
    }
}
