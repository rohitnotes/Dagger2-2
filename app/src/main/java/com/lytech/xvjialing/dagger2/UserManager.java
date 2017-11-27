package com.lytech.xvjialing.dagger2;

/**
 * Created by xvjialing on 2017/11/25.
 */

public class UserManager {
    private ApiService apiService;
    private UserStore userStore;

    public UserManager(ApiService apiService) {
        this.apiService = apiService;
    }


    public void register(){
        apiService.register();
    }
}
