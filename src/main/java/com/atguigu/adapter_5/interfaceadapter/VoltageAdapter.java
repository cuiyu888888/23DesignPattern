package com.atguigu.adapter_5.interfaceadapter;


/**
 * 适配器抽象类
 */
public abstract class VoltageAdapter implements IVoltage5V {

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output10V() {
        return 0;
    }

    @Override
    public int output50V() {
        return 0;
    }

    @Override
    public int output100V() {
        return 0;
    }

    @Override
    public int output110V() {
        return 0;
    }
}

