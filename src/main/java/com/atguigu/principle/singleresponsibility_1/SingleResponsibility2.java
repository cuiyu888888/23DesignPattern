package com.atguigu.principle.singleresponsibility_1;


/**
 * 设计模式的原则 1：单一职责原则
 *
 * 方式二：
 * 1. 遵守单一职责原则
 *
 * 问题：
 * 1. 但是这样做的改动很大，即将类分解，同时修改客户端
 * 2. 改进：直接修改Vehicle 类，改动的代码会比较少=>方案3
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }

}


// 公路上的交通工具
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

// 天上的交通工具
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

// 水里的交通工具
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
