package com.atguigu.decorator_7;

/**
 * 具体咖啡的父类
 * 继承饮料
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
