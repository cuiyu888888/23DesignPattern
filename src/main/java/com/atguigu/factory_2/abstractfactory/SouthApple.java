package com.atguigu.factory_2.abstractfactory;

/**
 * 具体实现的水果
 */
public class SouthApple extends Apple{
    @Override
    public void get() {
        System.out.println("南方的苹果");
    }
}
