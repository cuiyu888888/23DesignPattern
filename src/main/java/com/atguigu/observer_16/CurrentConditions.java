package com.atguigu.observer_16;

/**
 * 具体的观察者
 */
public class CurrentConditions implements Observer {

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("***今天温度: " + temperature + "***");
        System.out.println("***今天气压: " + pressure + "***");
        System.out.println("***今天湿度: " + humidity + "***");
    }

}
