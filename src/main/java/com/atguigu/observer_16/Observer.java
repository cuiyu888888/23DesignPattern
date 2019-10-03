package com.atguigu.observer_16;

/**
 * 观察者的接口
 */
public interface Observer {

    public void update(float temperature, float pressure, float humidity);

}
