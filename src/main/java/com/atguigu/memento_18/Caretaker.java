package com.atguigu.memento_18;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker（管理者）:
 *      负责在适当的时间保存/恢复Originator对象的状态。
 */
public class Caretaker {

    /**
     * 保存备份
     */
    private List<Memento> mementoList;
    public Caretaker(){
        mementoList = new ArrayList<>();
    }

    /**
     * 获得备份
     */
    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

    /**
     * 添加备份
     */
    public void setMemento(Memento memento) {
        mementoList.add(memento);
    }

}
