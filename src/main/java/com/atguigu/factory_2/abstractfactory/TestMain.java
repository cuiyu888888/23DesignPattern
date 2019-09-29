package com.atguigu.factory_2.abstractfactory;


/**
 * 抽象工厂模式
 */
public class TestMain {

    public static void main(String[] args) {
        FruitFactory southFruitFactory = new SouthFruitFactory();
        Fruit apple = southFruitFactory.getApple();
        apple.get();

        Fruit banana = southFruitFactory.getBanana();
        banana.get();

        FruitFactory nouthFruitFactory = new NouthFruitFactory();
        Fruit apple1 = nouthFruitFactory.getApple();
        apple1.get();

        Fruit banana1 = nouthFruitFactory.getBanana();
        banana1.get();
    }

}
