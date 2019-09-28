package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式五：
 *      懒汉式(线程不安全，同步代码块)
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 提供一个静态的公有方法，加入同步处理的代码，存在线程安全问题
 *
 * 存在的问题：
 *          1：虽然效率提高了，但是会存在线程安全的问题
 *          2：在多线程的情况下,都执行到了if()判断。当都判断为null时，接下来两个线程都会执行同步方法，这样就会产生线程安全的问题
 *
 */
public class SingletonTest05 {

    public static void main(String[] args) {
        //测试
        Singleton5 instance = Singleton5.getInstance();
        Singleton5 instance2 = Singleton5.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 懒汉式(线程不安全，同步代码块)
 */
class Singleton5 {

    //1. 构造器私有化, 防止外部new
    private Singleton5() {

    }

    //2.本类内部创建对象实例
    private static Singleton5 instance = null;

    //3：提供一个静态的公有方法，加入同步处理的代码，存在线程安全问题
    public static synchronized Singleton5 getInstance() {
        if(instance == null) {
            synchronized (Singleton5.class){
                instance = new Singleton5();
            }
        }
        return instance;
    }

}
