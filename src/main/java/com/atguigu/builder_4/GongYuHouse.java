package com.atguigu.builder_4;

/**
 * 建造公寓房子
 */
public class GongYuHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("公寓打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("公寓砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("公寓封顶");
    }
}
