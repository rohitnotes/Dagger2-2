package com.lytech.xvjialing.dagger2.domain;

import android.content.Context;
import android.util.Log;

import com.lytech.xvjialing.dagger2.domain.ApiService;

/**
 * Created by xvjialing on 2017/12/3.
 */

public class UserStore {

    private static final String TAG=ApiService.class.getSimpleName();

    private Context context;

    public UserStore(Context context) {
        this.context = context;
    }

    public void register(){
        Log.d(TAG, "register: UserSore");
    }
}
