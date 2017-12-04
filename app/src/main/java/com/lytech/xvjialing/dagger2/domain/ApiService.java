package com.lytech.xvjialing.dagger2.domain;

import android.util.Log;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by xvjialing on 2017/12/3.
 */

public class ApiService {

    private static final String TAG=ApiService.class.getSimpleName();

    private OkHttpClient okHttpClient;

//    @Inject
    public ApiService(OkHttpClient okHttpClient){
        this.okHttpClient=okHttpClient;
    }

    public void register(){
        Log.d(TAG, "register: ApiService");
        Request request=new Request.Builder()
                .get()
                .url("http://www.xvjialing.ink:32771/girls")
                .build();
        okHttpClient.newCall(request)
                .enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        String result = response.body().string();
                        Log.d(TAG, "onResponse: "+result);
                    }
                });
    }
}
