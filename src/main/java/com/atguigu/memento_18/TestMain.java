package com.atguigu.memento_18;

/**
 * 设计模式 18：备忘录模式
 */
public class TestMain {

    public static void main(String[] args) {
        Person person = new Person("cuiyu","男",25);
        System.out.println(person.toString());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(person.saveMemento());

        person.setSex("女");
        person.setAge(20);
        System.out.println(person.toString());

        person.restoreMemento(caretaker.getMemento(0));
        System.out.println(person.toString());
    }

}
