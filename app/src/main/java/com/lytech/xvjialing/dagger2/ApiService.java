package com.lytech.xvjialing.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by xvjialing on 2017/12/3.
 */

public class ApiService {

    private static final String TAG=ApiService.class.getSimpleName();

//    @Inject
    public ApiService() {
        Log.d(TAG, "ApiService: constractor");
    }

    @Inject
    public ApiService(String url) {
        Log.d(TAG, "ApiService url : "+url);
    }

    public void register(){
        Log.d(TAG, "register: ApiService");
    }
}
