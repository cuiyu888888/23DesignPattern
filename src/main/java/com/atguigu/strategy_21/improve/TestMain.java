package com.atguigu.strategy_21.improve;

/**
 * 设计模式 21：策略模式
 */
public class TestMain {

	public static void main(String[] args) {
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//

		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();

		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();

		//动态改变某个对象的行为, 北京鸭 不能飞
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("北京鸭的实际飞翔能力");
		pekingDuck.fly();
	}


}
