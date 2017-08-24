package com.cat.observerPattern.observer;

import com.cat.observerPattern.domain.WeatherInfo;

/**
 * Created by gxu on 2016/12/14.
 */
public interface WeatherObserver {
    //更新天气数据到看板 传入weather对象
    void update(WeatherInfo weatherInfo);

}
