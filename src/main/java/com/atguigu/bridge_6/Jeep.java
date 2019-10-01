package com.atguigu.bridge_6;

/**
 * Refined Abstraction
 *            Abstraction子类，具体的实体类
 */
public class Jeep extends Car {

    public Jeep(Engine engine) {
        super(engine);
    }

    public void installEngine() {
        System.out.print("Jeep：");
        this.getEngine().installEngine();
    }

}
