package com.atguigu.iterator_15;


import java.util.Iterator;

/**
 * 集合的抽象类
 */
public interface College {

    public String getName();

    //增加系的方法
    public void addDepartment(String name, String desc);

    //返回一个迭代器,遍历
    public Iterator createIterator();

}
