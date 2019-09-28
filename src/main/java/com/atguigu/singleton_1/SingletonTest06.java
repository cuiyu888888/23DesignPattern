package com.atguigu.singleton_1;

/**
 * 设计模式 1：单例设计模式
 *
 * 方式六：
 *      双重检查(不安全的写法)
 *
 * 步骤：
 *      1. 构造器私有化, 防止外部new
 *      2. 本类内部创建对象实例
 *      3. 提供一个静态的公有方法，加入双重检查代码
 *
 * 存在的问题：
 *      这种写法使得只有在加载新的对象进行同步，在加载完了之后，其他线程在synchronized同步代码块里的if()条件判断已经初始化好了单例对象。做到很好的并发度。
 *      至此，上面的写法一方面实现了Lazy-Load，另一个方面也做到了并发度很好的线程安全，一切看上很完美。
 *      这是，面试官可能会对你的回答满意的点点头。但是，你此时提出说，其实这种写法还是有问题的！！问题在哪里？假设线程A执行到了第一个if（）判断，它判断对象为空，于是线程A执行到第二个if()条件判断初始化这个对象，
 *      但初始化是需要耗费时间的，但是这个对象的地址其实已经存在了。此时线程B也执行到了第一个if（）方法判断，它判断不为空，于是直接返回这个对象。
 *      但是，这个对象还没有被完整的初始化！得到一个没有初始化完全的对象有什么用！！关于这个Double-Checked Lock的讨论有很多，目前公认这是一个Anti-Pattern，不推荐使用！
 *      所以当你的面试官听到你的这番答复，他会不会被Hold住呢？ *
 */
public class SingletonTest06 {

    public static void main(String[] args) {
        //测试
        Singleton6 instance = Singleton6.getInstance();
        Singleton6 instance2 = Singleton6.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

/**
 * 双重检查（不安全的写法）
 */
class Singleton6 {

    //1. 构造器私有化, 防止外部new
    private Singleton6() {

    }

    //2.本类内部创建对象实例
    private static Singleton6 instance = null;

    //3：提供一个静态的公有方法，加入双重检查代码
    public static Singleton6 getInstance() {
        if(instance == null) {
            synchronized (Singleton6.class){
                if(instance == null){
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }

}
