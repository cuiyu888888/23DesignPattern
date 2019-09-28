package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式四：
 *      懒汉式(线程安全，同步方法)
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
 *
 * 存在的问题：
 *          1：写到这里，面试官可能仍然会狡猾的看了你一眼
 *          2：继续刁难到：这个写法有没有什么性能问题呢？答案肯定是有的！同步的代价必然会一定程度的使程序的并发度降低。
 *          3：那么有没有什么方法，一方面是线程安全的，有可以有很高的并发度呢？我们观察到，线程不安全的原因其实是在初始化对象的时候，
 *          4：所以，可以想办法把同步的粒度降低，只在初始化对象的时候进行同步。
 *
 */
public class SingletonTest04 {

    public static void main(String[] args) {
        //测试
        Singleton4 instance = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 懒汉式(线程安全，同步方法)
 */
class Singleton4 {

    //1. 构造器私有化, 防止外部new
    private Singleton4() {

    }

    //2.本类内部创建对象实例
    private static Singleton4 instance = null;

    //3：提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton4 getInstance() {
        if(instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

}
