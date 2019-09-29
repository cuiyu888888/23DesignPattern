package com.atguigu.prototype_3.deepclone;

import java.io.Serializable;

/**
 * 深度clone属性为引用类型
 */
public class Friend implements Serializable, Cloneable {

    private String name;

    public Friend() {
    }

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
    @Override
    protected Friend clone() throws CloneNotSupportedException {
        return (Friend) super.clone();
    }
}
