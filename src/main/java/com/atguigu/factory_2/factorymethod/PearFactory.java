package com.atguigu.factory_2.factorymethod;


/**
 * 梨子工厂
 */
public class PearFactory implements FruitFactory {
    @Override
    public Fruit getFruit() throws IllegalAccessException, InstantiationException {
        return Pear.class.newInstance();
    }
}
