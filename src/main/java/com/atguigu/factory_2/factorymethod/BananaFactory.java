package com.atguigu.factory_2.factorymethod;

/**
 * 香蕉工厂
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() throws IllegalAccessException, InstantiationException {
        return Banana.class.newInstance();
    }
}
