package com.lytech.xvjialing.dagger2.domain;

import com.lytech.xvjialing.dagger2.domain.ApiService;
import com.lytech.xvjialing.dagger2.domain.UserStore;

/**
 * Created by xvjialing on 2017/12/3.
 */

public class UserManager {

    private UserStore userStore;

    private ApiService apiService;

    public UserManager(ApiService apiService,UserStore userStore) {
        this.userStore=userStore;

        this.apiService=apiService;
    }

    public void register(){

        userStore.register();

        apiService.register();
    }
}
