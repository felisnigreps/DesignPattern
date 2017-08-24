package com.cat.observerPattern.subject;

import com.cat.observerPattern.domain.WeatherInfo;
import com.cat.observerPattern.observer.WeatherObserver;

/**
 * Created by gxu on 2016/12/14.
 */
public interface WeatherSubject {
    //管理订阅者
    void add(WeatherObserver observer);

    void remove(WeatherObserver observer);

    //通知订阅者
    void notifyObserver(WeatherInfo info);
}
