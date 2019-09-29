package com.atguigu.builder_4.improve;

/**
 * 抽象的房子建造者
 */
public abstract class HouseBuilder {

    // 房子
    protected House house = new House();

    // 将建造的流程写好, 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    // 建造房子好， 将产品(房子) 返回
    public House getHouse() {
        return house;
    }

}
