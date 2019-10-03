package com.atguigu.mediator_17;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者类的抽象父类。
 */
public abstract class Mediator {

    /**
     * 持有关联对象集合的引用
     */
    private List<Person> personList;

    public Mediator() {
        personList = new ArrayList<>();
    }

    public List<Person> getPersonList(){
        return personList;
    }

    /**
     * 添加关联对象
     */
    public void addPerson(Person person){
        personList.add(person);
    }

    /**
     * 获取合适的对象
     */
    public abstract void getPartner(Person  person);
}
