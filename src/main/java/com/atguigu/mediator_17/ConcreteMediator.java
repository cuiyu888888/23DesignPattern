package com.atguigu.mediator_17;

/**
 * 具体的中介实现类
 */
public class ConcreteMediator extends Mediator {

    /**
     * 获取合适的对象
     */
    @Override
    public void getPartner(Person person) {
        for (Person person1 : getPersonList()) {
            if (person.getGender() != person1.getGender() && person.getCondition() == person1.getCondition()) {
                System.out.println(person1.getName() + "满足你的要求");
            }
        }
    }

}
