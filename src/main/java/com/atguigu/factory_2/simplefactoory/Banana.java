package com.atguigu.factory_2.simplefactoory;


/**
 * 香蕉即实现水果接口
 */
public class Banana implements Fruit {
    //采集
    @Override
    public void get() {
        System.out.println("获取香蕉");
    }
}
