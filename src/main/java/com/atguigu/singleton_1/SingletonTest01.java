package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式一：
 *      饿汉式(静态变量)
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2.本类内部创建对象实例
 *      3. 提供一个公有的静态方法，返回实例对象
 *
 * 存在的问题：
 *      1：这种写法就是所谓的饥饿模式，每个对象在没有使用之前就已经初始化了。
 *      2：这就可能带来潜在的性能问题：如果这个对象很大呢？没有使用这个对象之前，就把它加载到了内存中去是一种巨大的浪费。
 *      3：针对这种情况，我们可以对以上的代码进行改进，使用一种新的设计思想——延迟加载（Lazy-load Singleton）。
 *
 */
public class SingletonTest01 {

    public static void main(String[] args) {
        //测试
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 饿汉式(静态变量)
 */
class Singleton1 {

    //1. 构造器私有化, 防止外部new
    private Singleton1() {

    }

    //2.本类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance() {
        return instance;
    }

}
