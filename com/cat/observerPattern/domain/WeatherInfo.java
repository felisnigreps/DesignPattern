package com.cat.observerPattern.domain;

/**
 * Created by gxu on 2016/12/14.
 */
public class WeatherInfo {
    //天气对象，包括温度 湿度 气压
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherInfo(){};

    public WeatherInfo(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }



}
