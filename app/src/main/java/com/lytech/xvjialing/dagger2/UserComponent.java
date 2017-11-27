package com.lytech.xvjialing.dagger2;

import dagger.Component;

/**
 * Created by xvjialing on 2017/11/25.
 */

@Component(modules = {UserModule.class})
public interface UserComponent {
    void inject(MainActivity activity);
}
