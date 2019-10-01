package com.atguigu.decorator_7;

/**
 * 具体的装饰者：牛奶装饰者
 */
public class DecoratorMilk extends Decorator {

    public DecoratorMilk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }

}
