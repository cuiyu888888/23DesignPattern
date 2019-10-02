package com.atguigu.proxy_11.cglib;


/**
 * 被代理的对象
 */
public class TeacherDao {

    public String teach() {
        System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
        return "hello";
    }

}

