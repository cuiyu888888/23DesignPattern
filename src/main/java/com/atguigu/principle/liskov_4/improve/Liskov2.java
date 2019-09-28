package com.atguigu.principle.liskov_4.improve;

/**
 * 设计模式的原则 4：里氏替换原则
 *
 * 方式二：
 * 	可能会存在"里氏替换原则"的问题
 *
 * 解决方案：
 * 	创建一个更加基础的基类，让A类、B类都继承基类
 * 	如果B仍然想使用A的方法，可以使用组合关系来实现
 */
public class Liskov2 {

    public static void main(String[] args) {

        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("-----------------------");
        B b = new B();
        //因为B类不再继承A类，因此调用者，不会再func1是求减法
        //调用完成的功能就会很明确
        System.out.println("11+3=" + b.func1(11, 3));//这里本意是求出11+3
        System.out.println("1+8=" + b.func1(1, 8));// 1+8
        System.out.println("11+3+9=" + b.func2(11, 3));


        //使用组合仍然可以使用到A类相关方法
        System.out.println("11-3=" + b.func3(11, 3));// 这里本意是求出11-3

    }

}

/**
 * 创建一个更加基础的基类，让A类、B类都继承基类
 */
class Base {
    //把更加基础的方法和成员写到Base类
}

/**
 * A类、继承Base基类
 */
class A extends Base {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}


/**
 * B类同样也继承Base基类
 */
class B extends Base {


    /**
     * 这里，重写了A类的方法, 可能是无意识
     */
    public int func1(int a, int b) {
        return a + b;
    }

    // 方法的相加
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    /**
     * 如果B仍然想使用A的方法
     * 可以使用组合关系来实现
     */
    private A a = new A();

    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

}
