package com.atguigu.decorator_7;

/**
 * 装饰者
 */
public class Decorator extends Drink {

    private Drink obj;

    // 组合饮料
    public Decorator(Drink obj) {
        this.obj = obj;
    }

    // 计算价格
    @Override
    public float cost() {
        // getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    // 输出被装饰者的信息
    @Override
    public String getDes() {
        return des + " " + getPrice() + " && " + obj.getDes();
    }



}
