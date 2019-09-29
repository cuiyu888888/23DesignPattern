package com.atguigu.factory_2.factorymethod;


/**
 * 梨子实现水果接口
 */
public class Pear implements Fruit{
    //采集
    @Override
    public void get() {
        System.out.println("采摘梨子");
    }
}
