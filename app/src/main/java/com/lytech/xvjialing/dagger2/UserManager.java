package com.lytech.xvjialing.dagger2;

import android.util.Log;


/**
 * Created by xvjialing on 2017/11/25.
 */

public class UserManager {

    private static final String TAG=UserManager.class.getSimpleName();

    private ApiService apiService;
    private UserStore userStore;

    public UserManager(ApiService apiService) {
        this.apiService = apiService;
    }


    public void register(){
        Log.d(TAG, "userManager register: ");
        apiService.register();
    }
}
