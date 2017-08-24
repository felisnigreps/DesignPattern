package com.cat.singletonPattern;

/**
 * Created by gxu on 2017/1/22.
 */
public class ThreadUnsafeSingleton {

    private static ThreadUnsafeSingleton singleton ;

    //私有化构造函数
    private ThreadUnsafeSingleton(){};

    //声明static来实现外部调用
    public static ThreadUnsafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadUnsafeSingleton();
        }
        return singleton;
    }
}
