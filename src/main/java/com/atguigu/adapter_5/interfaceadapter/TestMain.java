package com.atguigu.adapter_5.interfaceadapter;


/**
 * 设计模式 5：适配器模式
 *
 * 方式三：
 *      接口适配器方式
 *
 * 优点：
 *      1）：一些书籍称为：适配器模式(Default Adapter Pattern)或缺省适配器模式。
 *      2）：核心思路：当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求。
 *      3）：适用于一个接口不想使用其所有的方法的情况。
 *
 */
public class TestMain {

    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        VoltageAdapter voltageAdapter = new VoltageAdapter() {
            @Override
            public int output5V() {
                int i = voltage220V.output220V();
                return i / 44;
            }
        };
        phone.charging(voltageAdapter);

    }

}
