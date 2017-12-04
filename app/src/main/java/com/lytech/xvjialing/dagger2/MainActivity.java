package com.lytech.xvjialing.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lytech.xvjialing.dagger2.component.DaggerHttpComponent;
import com.lytech.xvjialing.dagger2.component.DaggerUserComponent;
import com.lytech.xvjialing.dagger2.component.HttpComponent;
import com.lytech.xvjialing.dagger2.domain.TestService;
import com.lytech.xvjialing.dagger2.domain.UserManager;
import com.lytech.xvjialing.dagger2.module.HttpModule;
import com.lytech.xvjialing.dagger2.module.TestModule;
import com.lytech.xvjialing.dagger2.module.UserModule;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity {

    @Named("dev")
    @Inject
    TestService testService;

    @Inject
    UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent.builder()
                .testModule(new TestModule())
                .userModule(new UserModule(this))
                .build().inject(this);


        testService.test();

        userManager.register();
    }
}
