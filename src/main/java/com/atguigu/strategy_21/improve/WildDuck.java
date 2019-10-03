package com.atguigu.strategy_21.improve;

/**
 * Context
 * 		策略的外部封装类，或者说策略的容器类。根据不同策略执行不同的行为。策略由外部环境决定。
 */
public class WildDuck extends Duck {

	//构造器，传入FlyBehavor 的对象
	public  WildDuck() {
		flyBehavior = new GoodFlyBehavior();
	}


	@Override
	public void display() {
		System.out.println(" 这是野鸭 ");
	}

}
