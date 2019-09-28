package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式二：
 *      饿汉式（静态代码块）
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 在静态代码块中进行类的初始化过程
 *      4. 提供一个公有的静态方法，返回实例对象
 *
 * 存在的问题：
 *      1：这种写法就是所谓的饥饿模式，每个对象在没有使用之前就已经初始化了。
 *      2：这就可能带来潜在的性能问题：如果这个对象很大呢？没有使用这个对象之前，就把它加载到了内存中去是一种巨大的浪费。
 *      3：针对这种情况，我们可以对以上的代码进行改进，使用一种新的设计思想——延迟加载（Lazy-load Singleton）。
 *
 */
public class SingletonTest02 {

    public static void main(String[] args) {
        //测试
        Singleton2 instance = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 饿汉式（静态代码块）
 */
class Singleton2 {

    //1. 构造器私有化, 防止外部new
    private Singleton2() {

    }

    //2.本类内部创建对象实例
    private static Singleton2 instance;

    //3.在静态代码块中，创建单例对象
    static {
        instance = new Singleton2();
    }

    //4. 提供一个公有的静态方法，返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }

}
