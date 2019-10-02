package com.atguigu.iterator_15;

import java.util.Iterator;
import java.util.List;

/**
 * Iterator的实现类
 */
public class InfoColleageIterator implements Iterator {

    /**
     * 信息工程学院是以List方式存放系
     */
    List<Department> departmentList;
    /**
     * 索引
     */
    int index = -1;


    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    /**
     * 判断list中还有没有下一个元素
     */
    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    /**
     * 获取下一个原始
     */
    @Override
    public Object next() {
        return departmentList.get(index);
    }

    /**
     * 空实现remove
     */
    public void remove() {

    }

}
