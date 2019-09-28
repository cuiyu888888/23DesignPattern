package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式九：
 *      枚举
 *
 * 优点：
 *      1：这借助 JDK1.5 中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象。
 *      2：这种方式是 Effective Java 作者 Josh Bloch 提倡的方式
 *
 */
public class SingletonTest09 {

    public static void main(String[] args) {
        //测试
        Singleton9 instance = SingletonEnum.INSTANCE.getInstance();
        Singleton9 instance2 = SingletonEnum.INSTANCE.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 使用枚举，可以实现单例
 */

enum SingletonEnum {
    //属性
    INSTANCE;

    private Singleton9 singleton9 = null;

    SingletonEnum(){
        singleton9 = new Singleton9();
    }
    public Singleton9 getInstance() {
        return singleton9;
    }
}

/**
 * 使用枚举，可以实现单例
 */
class Singleton9 {

}
