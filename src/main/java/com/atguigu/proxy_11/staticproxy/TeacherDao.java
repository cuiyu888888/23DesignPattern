package com.atguigu.proxy_11.staticproxy;

/**
 * 被代理的对象
 */
public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println(" 老师授课中  。。。。。");
    }

}

