package com.atguigu.iterator_15;

import java.util.Iterator;

/**
 * 设计模式 15：迭代器模式
 */
public class TestMain {

    public static void main(String[] args) {

        College college = new InfoCollege();
        Iterator iterator = college.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
