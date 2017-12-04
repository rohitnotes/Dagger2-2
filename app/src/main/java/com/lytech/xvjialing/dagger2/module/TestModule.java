package com.lytech.xvjialing.dagger2.module;

import android.util.Log;

import com.lytech.xvjialing.dagger2.domain.TestService;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xvjialing on 2017/12/4.
 */

@Module
public class TestModule {
    
    private static final String TAG=TestModule.class.getSimpleName();

    @Named("dev")
    @Provides
    public TestService getTestServiceDev(){
        Log.d(TAG, "getTestServiceDev: ");
        return new TestService();
    }

    @Named("release")
    @Provides
    public TestService getTestServiceRelease(){
        Log.d(TAG, "getTestServiceRelease: ");
        return new TestService();
    }
}
