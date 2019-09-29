package com.atguigu.factory_2.factorymethod;

/**
 * 工厂方法模式(多态工厂模式)
 */
public interface FruitFactory {

    public Fruit getFruit() throws IllegalAccessException, InstantiationException;

}


