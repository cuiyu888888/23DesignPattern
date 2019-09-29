package com.atguigu.prototype_3.improve;


/**
 * 被克隆的对象,需要实现Cloneable接口，并重写clone()方法
 */
public class Person implements Cloneable{

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 克隆该实例，使用默认的clone方法来完成
     */
    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
