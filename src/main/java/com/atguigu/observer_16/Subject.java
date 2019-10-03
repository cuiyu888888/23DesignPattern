package com.atguigu.observer_16;


/**
 * 被观察者
 */
public interface Subject {

    /**
     * 注册（添加）观察者
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObservers();

}
