package com.atguigu.builder_4.improve;

import com.atguigu.builder_4.CommonHouse;

/**
 * 设计模式 4：建造者模式
 *
 * 方式二：
 *      建造者模式
 *
 */
public class TestMain {

    public static void main(String[] args) throws Exception {

        //盖普通房子
        CommonBuilder commonBuilder = new CommonBuilder();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonBuilder);

        //完成盖房子，返回产品(普通房子)
        House house = houseDirector.constructHouse();



        //盖高楼
        GongYuBuilder gongYuBuilder = new GongYuBuilder();
        //重置建造者
        houseDirector.setHouseBuilder(gongYuBuilder);
        //完成盖房子，返回产品(高楼)
        houseDirector.constructHouse();

    }

}

