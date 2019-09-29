package com.atguigu.builder_4.improve;


/**
 * 具体的房子建造者：普通房子的建造者
 */
public class CommonBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 普通房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋顶 ");
    }

}

