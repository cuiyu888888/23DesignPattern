package com.atguigu.principle.liskov_4;

/**
 * 设计模式的原则 4：里氏替换原则
 *
 * 方式一：
 * 	可能会存在"里氏替换原则"的问题
 *
 * 问题：
 * 	B类继承A类，假设B类在增加新的方法的同时、不小心重写了父类A的方法，
 * 	当调用方法的时候，本以为调用的还是原本父类A的方法，可是却调到了子类B的方法。容易产生莫名的错误
 */
public class Liskov1 {

	public static void main(String[] args) {

		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		B b = new B();
		System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出11-3
		System.out.println("1-8=" + b.func1(1, 8));// 1-8
		System.out.println("11+3+9=" + b.func2(11, 3));

	}

}

/**
 * A类
 */
class A {
	//返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

/**
 * B类继承了A
 * 增加了一个新功能：完成两个数相加,然后和9求和
 *
 */
class B extends A {
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

}

