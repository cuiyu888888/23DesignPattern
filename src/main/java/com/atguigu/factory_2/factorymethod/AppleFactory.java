package com.atguigu.factory_2.factorymethod;

/**
 * 苹果工厂
 */
public class AppleFactory implements FruitFactory{

    @Override
    public Fruit getFruit() throws IllegalAccessException, InstantiationException {
        return Apple.class.newInstance();
    }
}

