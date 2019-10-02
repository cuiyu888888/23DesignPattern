package com.atguigu.proxy_11.dynamic;

/**
 * 被代理的对象
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}

