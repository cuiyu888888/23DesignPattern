package com.atguigu.factory_2.abstractfactory;

/**
 * 公共的水果工厂接口
 */
public interface FruitFactory {

    //获取苹果
    public Fruit getApple();

    //获取香蕉
    public Fruit getBanana();


}
