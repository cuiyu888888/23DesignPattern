package com.atguigu.composite_8;

/**
 * Component （树形结构的节点抽象）
 *      为所有的对象定义统一的接口（公共属性，行为等的定义）
 *      提供管理子节点对象的接口方法
 *      [可选]提供管理父节点对象的接口方法
 *
 */
public abstract class OrganizationComponent {

    // 名字
    private String name;
    // 说明
    private String des;

    protected  void add(OrganizationComponent organizationComponent) {
        //默认实现,不支持此操作的异常
        throw new UnsupportedOperationException();
    }

    protected  void remove(OrganizationComponent organizationComponent) {
        //默认实现,不支持此操作的异常
        throw new UnsupportedOperationException();
    }

    //构造器
    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 方法print, 做成抽象的, 子类都需要实现
     */
    protected abstract void print();

}


