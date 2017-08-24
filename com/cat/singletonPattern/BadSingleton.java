package com.cat.singletonPattern;

/**
 * Created by gxu on 2017/1/22.
 */
public class BadSingleton {
    private static BadSingleton singleton;

    private BadSingleton() {
    }

    public static synchronized BadSingleton getInstance() {
        if (singleton == null) {
            singleton = new BadSingleton();
        }
        return singleton;
    }
}
