package com.atguigu.builder_4;

/**
 * 建房子的抽象类
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    // 构建房子步骤
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }

}
