package com.atguigu.factory_2.abstractfactory;

/**
 * 具体的水果工厂（北方水果工厂）
 */
public class NouthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new NouthBanana();
    }
}
