package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式三：
 *      懒汉式(线程不安全)
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 提供一个静态的公有方法，当使用到该方法时，才去创建 instance
 *
 * 存在的问题：
 *      1:这种写法就是所谓的懒汉模式。
 *      2:它使用了延迟加载来保证对象在没有使用之前，是不会进行初始化的。
 *      3:但是，通常这个时候面试官又会提问新的问题来刁难一下。
 *      他会问：这种写法线程安全吗？回答必然是：不安全。这是因为在多个线程可能同时运行到if判断时，判断singObj为null，于是同时进行了初始化。所以，这是面临的问题是如何使得这个代码线程安全？很简单，在那个方法前面加一个Synchronized就OK了。
 */
public class SingletonTest03 {

    public static void main(String[] args) {
        //测试
        Singleton3 instance = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 懒汉式(线程不安全)
 */
class Singleton3 {

    //1. 构造器私有化, 防止外部new
    private Singleton3() {

    }

    //2.本类内部创建对象实例
    private static Singleton3 instance = null;

    //3：提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    public static Singleton3 getInstance() {
        if(instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

}
