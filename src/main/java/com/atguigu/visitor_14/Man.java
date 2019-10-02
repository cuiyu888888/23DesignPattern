package com.atguigu.visitor_14;

/**
 * ConcreteElement 为具体元素，
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
