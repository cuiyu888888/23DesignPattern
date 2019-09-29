package com.atguigu.factory_2.factorymethod;


/**
 * 厂方法模式(多态工厂模式)
 *
 * 优点：
 *      当新增加一个水果"梨子"，只需要增加一个“Pear.class“梨子水果类，在增加一个PearFactory.class梨子工厂类。
 *      这样的好处在于，在增加一个水果的时候，不需要更改原先的水果工厂类，不会影响到其他的水果业务逻辑。
 *
 */
public class TestMain {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.get();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        banana.get();

        FruitFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.getFruit();
        pear.get();
    }

}

