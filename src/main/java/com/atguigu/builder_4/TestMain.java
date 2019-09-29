package com.atguigu.builder_4;


/**
 * 设计模式 4：建造者模式
 *
 * 方式一：
 *      传统方式
 *
 * 问题：
 *      设计的程序结构，过于简单，没有设计缓存层对象，程序的扩展和维护不好. 也就是说，这种设计方案，把产品(即：房子) 和 创建产品的过程(即：建房子流程) 封装在一起，耦合性增强了。
 *
 */
public class TestMain {

    public static void main(String[] args) throws Exception {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();

        GongYuHouse gongYuHouse = new GongYuHouse();
        gongYuHouse.build();

    }

}

