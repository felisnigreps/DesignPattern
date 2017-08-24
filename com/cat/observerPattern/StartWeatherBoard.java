package com.cat.observerPattern;

import com.cat.observerPattern.display.impl.CatWeatherBoard;
import com.cat.observerPattern.observer.WeatherObserver;
import com.cat.observerPattern.subject.impl.WeatherHandler;

/**
 * Created by gxu on 2016/12/14.
 */
public class StartWeatherBoard {
    public static void main(String[] args) {
        WeatherObserver cat = new CatWeatherBoard("moi");
        WeatherHandler handler = new WeatherHandler();
        handler.add(cat);

        handler.setMeasurement(80, 65, 30.4f);
        handler.setMeasurement(82, 70, 29.2f);
        handler.setMeasurement(78, 90, 29.2f);
    }
}
