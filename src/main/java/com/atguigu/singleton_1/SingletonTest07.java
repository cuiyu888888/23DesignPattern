package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式七：
 *      双重检索—运用volatile方式
 *      运用volatile来保证安全
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 提供一个静态的公有方法，加入双重检查代码
 *
 */
public class SingletonTest07 {

    public static void main(String[] args) {
        //测试
        Singleton7 instance = Singleton7.getInstance();
        Singleton7 instance2 = Singleton7.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 双重检索—运用volatile方式
 */
class Singleton7 {

    //1. 构造器私有化, 防止外部new
    private Singleton7() {

    }

    //2.本类内部创建对象实例
    private static volatile Singleton7 instance = null;

    //3：提供一个静态的公有方法，加入双重检查代码
    public static Singleton7 getInstance() {
        if(instance == null) {
            synchronized (Singleton7.class){
                if(instance == null){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }

}
