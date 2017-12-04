package com.lytech.xvjialing.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerUserComponent
                .builder()
                .userModule(new UserModule(this))
                .httpModule(new HttpModule())
                .build()
                .inject(this);

        userManager.register();
    }
}
