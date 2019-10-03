package com.atguigu.strategy_21.improve;

/**
 *	ConcreteStrategy
 * 		各种策略（算法）的具体实现。
 */
public class NoFlyBehavior implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println(" 不会飞翔  ");
	}

}
