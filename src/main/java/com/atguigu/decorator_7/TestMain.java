package com.atguigu.decorator_7;


/**
 * 设计模式 7：装饰者模式
 */
public class TestMain {

    /**
     * 装饰者模式下的订单：2份巧克力 + 1份牛奶 + LongBlackCoffee
     */
    public static void main(String[] args) throws Exception {

        // 1. 点一份 LongBlack
        Drink order = new LongBlackCoffee();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDes());


        // 2. order 加入一份牛奶
        order = new DecoratorMilk(order);
        System.out.println("order 加入一份牛奶 费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 描述 = " + order.getDes());


        // 3. order 加入一份巧克力
        order = new DecoratorChocolate(order);
        System.out.println("order 加入一份牛奶 加入一份巧克力  费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入一份巧克力 描述 = " + order.getDes());


        // 4. order 加入一份巧克力
        order = new DecoratorChocolate(order);
        System.out.println("order 加入一份牛奶 加入2份巧克力   费用 =" + order.cost());
        System.out.println("order 加入一份牛奶 加入2份巧克力 描述 = " + order.getDes());

    }
}

