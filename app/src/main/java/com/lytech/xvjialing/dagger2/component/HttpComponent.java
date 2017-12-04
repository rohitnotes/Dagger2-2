package com.lytech.xvjialing.dagger2.component;

import com.lytech.xvjialing.dagger2.module.HttpModule;

import dagger.Component;
import okhttp3.OkHttpClient;

/**
 * Created by xvjialing on 2017/12/3.
 */

@Component(modules = HttpModule.class)
public interface HttpComponent {

}
