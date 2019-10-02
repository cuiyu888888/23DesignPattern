package com.atguigu.visitor_14;

/**
 * 访问者的抽象
 */
public abstract class Action {

    //得到男性 的测评
    public abstract void getManResult(Man man);

    //得到女的 测评
    public abstract void getWomanResult(Woman woman);

}
