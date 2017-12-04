package com.lytech.xvjialing.dagger2.component;

import com.lytech.xvjialing.dagger2.MainActivity;
import com.lytech.xvjialing.dagger2.module.HttpModule;
import com.lytech.xvjialing.dagger2.module.TestModule;
import com.lytech.xvjialing.dagger2.module.UserModule;

import dagger.Component;

/**
 * Created by xvjialing on 2017/12/3.
 */

@Component(modules = {UserModule.class, TestModule.class,HttpModule.class})   //这句话将Componet与module关联起来
public interface UserComponent {

    void inject(MainActivity activity);  //这句话将Component与Container（也就是Activity）关联起来

}
