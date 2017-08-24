package com.cat.observerPattern.subject.impl;

import com.cat.observerPattern.domain.WeatherInfo;
import com.cat.observerPattern.observer.WeatherObserver;
import com.cat.observerPattern.subject.WeatherSubject;

import java.util.ArrayList;

/**
 * Created by gxu on 2016/12/14.
 */
public class WeatherHandler implements WeatherSubject {
    //所有订阅者
    private ArrayList<WeatherObserver> observes;


    public WeatherHandler(){
        observes = new ArrayList<>();
    }


    @Override
    public void add(WeatherObserver observer) {

        observes.add(observer);
    }

    @Override
    public void remove(WeatherObserver observer) {
        observes.remove(observer);
    }


    @Override
    public void notifyObserver(WeatherInfo info) {
        //给所有订阅者发送更新信息
        for (WeatherObserver o : observes) {
            o.update(info);
        }
    }

    //当天气数据被更新时调用这个方法 这个是上游提供的方法，所不不做修改
    public void measurementsChanged(WeatherInfo info) {
        notifyObserver(info);
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        WeatherInfo info = new WeatherInfo();
        
        info.setHumidity(humidity);
        info.setPressure(pressure);
        info.setTemperature(temperature);

        measurementsChanged(info);
    }
}
