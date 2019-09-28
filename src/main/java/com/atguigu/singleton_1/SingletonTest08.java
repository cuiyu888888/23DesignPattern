package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式八：
 *      静态内部类
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 提供一个静态的公有方法，加入双重检查代码
 *
 * 优点：
 *      1：这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 *      2：静态内部类方式在 Singleton 类被装载时并不会立即实例化，而是在需要实例化时，调用 getInstance 方法，才会装载 SingletonInstance 类，从而完成 Singleton 的实例化。
 *      3：类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM 帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 *
 */
public class SingletonTest08 {

    public static void main(String[] args) {
        //测试
        Singleton8 instance = Singleton8.getInstance();
        Singleton8 instance2 = Singleton8.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 静态内部类
 */
class Singleton8 {

    //1. 构造器私有化, 防止外部new
    private Singleton8() {

    }

    //2. 写一个静态内部类,该类中有一个静态属性 Singleton
    private static class SingletonInstance {
        private static final Singleton8 INSTANCE = new Singleton8();
    }

    //3. 提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static Singleton8 getInstance() {
        return SingletonInstance.INSTANCE;
    }

}
