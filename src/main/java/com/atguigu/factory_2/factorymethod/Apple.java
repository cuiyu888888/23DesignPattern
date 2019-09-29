package com.atguigu.factory_2.factorymethod;

/**
 * 苹果即实现水果接口
 */
public class Apple implements Fruit {
    //采集
    @Override
    public void get() {
        System.out.println("获取苹果");
    }
}

