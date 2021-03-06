package com.atguigu.memento_18;

/**
 *
 * Memento（备忘录）：
 *      该对象由Originator创建，主要用来保存Originator的内部状态。
 *
 */
public class Memento {

    private String name;
    private String sex;
    private int age;

    public Memento(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
