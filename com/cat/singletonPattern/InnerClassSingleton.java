package com.cat.singletonPattern;

/**
 * Created by gxu on 2017/1/22.
 */
public class InnerClassSingleton {
    //可以使用的单例 不存在问题


    private InnerClassSingleton() {
    }

    private static class SingletonInstance {
        private static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonInstance.singleton;
    }
}
