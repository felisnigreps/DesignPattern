package com.cat.singletonPattern;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by gxu on 2017/1/22.
 */
public class SingletonTest {

    //向HashSet中插入数据来验证是否为相同实例 因为HashSet没有重复的元素，可以通过hash set的大小来确定生成了几个实例
    // 生成一个线程安全的hash set  这块为什么要用线程安全的？ 等会测试一下不安全的set
    final static Set singletonContainer = Collections.synchronizedSet(new HashSet<>());

    static class AddElements implements Runnable {
        @Override
        public void run() {
            //线程不安全
            //singletonContainer.add(ThreadUnsafeSingleton.getInstance());
            //资源开销大 速度慢 锁住了整个方法
            //singletonContainer.add(BadSingleton.getInstance());
            //通常情况下的单例 JVM层面存在不同步危险
            //singletonContainer.add(RegularSingleton.getInstance());
            //静态内部类，可用
            singletonContainer.add(InnerClassSingleton.getInstance());
            //枚举单例 可用
            //singletonContainer.add(EnumSingleton.INSTANCE);
        }
    }


    public static void main(String[] args) {
        //创建一个线程池 一直调用
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000000; i++) {
            service.execute(new AddElements());
        }
        System.out.println(singletonContainer.size());
        service.shutdown();

    }


}
