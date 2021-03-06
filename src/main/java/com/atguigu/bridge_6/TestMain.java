package com.atguigu.bridge_6;


/**
 * 设计模式 六：桥接模式
 *      Car拥有Engine的引用，这就是桥接模式的那个桥
 *
 *  一、什么是桥接模式
 *      Bridge 模式又叫做桥接模式，是构造型的设计模式之一。
 *      Bridge模式基于类的最小设计原则，通过使用封装，聚合以及继承等行为来让不同的类承担不同的责任。
 *      它的主要特点是把抽象（abstraction）与行为实现（implementation）分离开来，从而可以保持各部分的独立性以及应对它们的功能扩展。
 *
 *  三、桥接模式的角色和职责
 *         TestMain ：Bridge模式的使用者
 *         Abstraction ：抽象类接口（接口或抽象类）维护对行为实现（Implementor）的引用
 *         Refined Abstraction ：Abstraction子类
 *         Implementor ：行为实现类接口 (Abstraction接口定义了基于Implementor接口的更高层次的操作)
 *         ConcreteImplementor ：Implementor子类
 **/
public class TestMain {

    public static void main(String[] args) {

        Engine engine2000 = new Engine2000();
        Engine engine2200 = new Engine2200();

        Car car1 = new Bus(engine2000);
        car1.installEngine();

        Car car2 = new Bus(engine2200);
        car2.installEngine();

        Car jeep1 = new Jeep(engine2000);
        jeep1.installEngine();

        Car jeep2 = new Jeep(engine2200);
        jeep2.installEngine();

    }

}


