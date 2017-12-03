package com.lytech.xvjialing.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

//
//    private UserManager userManager;

    @Inject   //告诉dagger此处需要依赖注入
    ApiService mApiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        userManager = new UserManager();
//
//        userManager.register();

        DaggerUserComponent.create().inject(this);

        mApiService.register();

    }
}
