package com.cat.observerPattern.display.impl;

import com.cat.observerPattern.display.WeatherBoard;
import com.cat.observerPattern.domain.WeatherInfo;
import com.cat.observerPattern.observer.WeatherObserver;

/**
 * Created by gxu on 2016/12/14.
 */
public class CatWeatherBoard implements WeatherBoard, WeatherObserver {

    private String name;

    public CatWeatherBoard(String name) {
        this.name = name;
    }
    @Override
    public void display(WeatherInfo info) {
        System.out.println("I'm " + name);
        System.out.println("Current conditions: " + info.getTemperature() + "F degrees and "
                + info.getHumidity() + "% humidity");
    }
    @Override
    public void update(WeatherInfo weatherInfo) {
        display(weatherInfo);
    }
}
