package com.atguigu.observer_16;

/**
 * 设计模式 16：观察者模式
 */
public class TestMain {

    public static void main(String[] args) {

        // 观察者
        Observer observer = new CurrentConditions();

        // 被观察者
        Subject subject = new WeatherData();

        // 将观察者注册到被观察者中
        subject.registerObserver(observer);

        ((WeatherData) subject).setData(20f,100f,20f);
    }

}
