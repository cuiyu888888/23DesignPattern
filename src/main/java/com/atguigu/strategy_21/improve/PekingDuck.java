package com.atguigu.strategy_21.improve;

/**
 * Context
 * 		策略的外部封装类，或者说策略的容器类。根据不同策略执行不同的行为。策略由外部环境决定。
 */
public class PekingDuck extends Duck {

	//假如北京鸭可以飞翔，但是飞翔技术一般
	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();

	}

	@Override
	public void display() {
		System.out.println("~~北京鸭~~~");
	}

}
