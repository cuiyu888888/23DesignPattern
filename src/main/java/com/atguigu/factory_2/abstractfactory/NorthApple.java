package com.atguigu.factory_2.abstractfactory;

/**
 * 具体实现的水果
 */
public class NorthApple extends Apple {
    @Override
    public void get() {
        System.out.println("北方的苹果");
    }
}
