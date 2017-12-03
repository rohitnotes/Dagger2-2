package com.lytech.xvjialing.dagger2;

/**
 * Created by xvjialing on 2017/12/3.
 */

public class UserManager {

    private UserStore userStore;

    private ApiService apiService;

    public UserManager() {
        userStore=new UserStore();

        apiService=new ApiService();
    }

    public void register(){

        userStore.register();

        apiService.register();
    }
}
