package com.atguigu.bridge_6;


/**
 * Refined Abstraction
 *            Abstraction子类，具体的实体类
 */
public class Bus extends Car{

    public Bus(Engine engine) {
        super(engine);
    }

    public void installEngine() {
        System.out.print("Bus:");
        this.getEngine().installEngine();
    }

}
