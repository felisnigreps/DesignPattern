package com.cat.singletonPattern;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by gxu on 2017/1/22.
 */
public class RegularSingleton {
    private static RegularSingleton singleton;

    private RegularSingleton() {
    }

    public static RegularSingleton getInstance() {
        //先判断是否为空
        if (singleton == null) {
            //块级别锁
            synchronized (RegularSingleton.class) {
                //在这再判断一次的里有是，如果A B同时检测到为空，A进入块级别锁，A率先生成新对象，B还在等待，A生成完毕后B进入锁，
                // 如果这时候不判断的话，还会继续生成新对象
                if (singleton == null) {
                    singleton = new RegularSingleton();
                }
            }
        }
        return singleton;
    }
}
