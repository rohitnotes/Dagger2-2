package com.lytech.xvjialing.dagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by xvjialing on 2017/11/25.
 */

public class ApiService {

    private static final String TAG=ApiService.class.getSimpleName();

    @Inject
    public ApiService() {

    }

    public void register(){
        Log.d(TAG, "register: ");
    }

}
