package com.atguigu.strategy_21.improve;

/**
 * Context
 * 		策略的外部封装类，或者说策略的容器类。根据不同策略执行不同的行为。策略由外部环境决定。
 */
public class ToyDuck extends Duck{

	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
	}

	@Override
	public void display() {
		System.out.println("玩具鸭");
	}

	//需要重写父类的所有方法
	public void quack() {
		System.out.println("玩具鸭不能叫~~");
	}

	public void swim() {
		System.out.println("玩具鸭不会游泳~~");
	}


}
