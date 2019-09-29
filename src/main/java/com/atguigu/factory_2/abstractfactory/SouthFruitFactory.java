package com.atguigu.factory_2.abstractfactory;

/**
 * 具体的水果工厂（南方水果工厂）
 */
public class SouthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }

}
