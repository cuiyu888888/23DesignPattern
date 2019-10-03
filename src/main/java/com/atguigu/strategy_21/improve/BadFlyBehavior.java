package com.atguigu.strategy_21.improve;

/**
 *	ConcreteStrategy
 * 		各种策略（算法）的具体实现。
 */
public class BadFlyBehavior implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println(" 飞翔技术一般 ");
	}

}
