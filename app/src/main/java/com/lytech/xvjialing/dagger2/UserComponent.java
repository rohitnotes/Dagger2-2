package com.lytech.xvjialing.dagger2;

import dagger.Component;

/**
 * Created by xvjialing on 2017/12/3.
 */

@Component(modules = {UserModule.class})   //这句话将Componet与module关联起来
public interface UserComponent {

    void inject(MainActivity activity);  //这句话将Component与Container（也就是Activity）关联起来

}
