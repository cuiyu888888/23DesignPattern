package com.atguigu.mediator_17;


/**
 * 关联类的抽象父类:
 * 其中包含中介者的引用Mediator
 */
public abstract class Person {

    private String name;
    private int gender;
    private int condition;
    private Mediator mediator;

    public Person(String name, int gender, int condition, Mediator mediator) {
        this.name = name;
        this.gender = gender;
        this.condition = condition;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

}
