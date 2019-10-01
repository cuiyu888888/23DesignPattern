package com.atguigu.bridge_6;

/**
 * Abstraction
 *            抽象类接口（接口或抽象类）
 *            维护对行为实现（Implementor）的引用
 *  这就是桥接模式的那个桥
 */
public abstract class Car {

    /**
     * 拥有维护对行为实现（Implementor）的引用
     * 这就是桥接模式的那个桥
     */
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void installEngine();

}
