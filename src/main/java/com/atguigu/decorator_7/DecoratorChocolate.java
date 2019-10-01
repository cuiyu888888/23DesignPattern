package com.atguigu.decorator_7;

/**
 * 具体的装饰者：巧克力装饰者
 */
public class DecoratorChocolate extends Decorator{

    public DecoratorChocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 调味品 的价格
    }
}
