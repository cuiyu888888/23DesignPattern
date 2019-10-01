package com.atguigu.decorator_7;

/**
 * 具体的装饰者：豆浆装饰者
 */
public class DecoratorSoy extends Decorator {

    public DecoratorSoy(Drink obj) {
        super(obj);
        setDes(" 豆浆  ");
        setPrice(1.5f);
    }
}
