package com.atguigu.prototype_3;


/**
 * 设计模式 3：原型模式
 *
 * 方式一：
 *      传统的方法
 *
 */
public class TestMain {

    public static void main(String[] args) {
        Person person = new Person("tom", 12);

        Person person1 = new Person();
        person1.setName(person.getName());
        person1.setAge(person.getAge());

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person == person1);

    }

}
