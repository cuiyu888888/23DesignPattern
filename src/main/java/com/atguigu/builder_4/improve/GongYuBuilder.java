package com.atguigu.builder_4.improve;

/**
 * 具体的房子建造者：公寓房子的建造者
 */
public class GongYuBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 公寓的打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 公寓的砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 公寓的透明屋顶 ");
    }
}

