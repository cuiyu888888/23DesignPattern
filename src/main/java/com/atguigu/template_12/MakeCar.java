package com.atguigu.template_12;

/**
 * AbstractClass：
 *      抽象类的父类
 *
 *  make :
 *      模板方法
 *
 */
public abstract class MakeCar {

    //组装车头
    public abstract void makeHead();

    //组装车身
    public abstract void makeBody();

    //组装车尾
    public abstract void makeTail();

    /**
     * 存在多个具有同样操作步骤或者操作过程的应用场景，但某些具体的操作细节却各不相同的步骤放到抽象类中
     *
     * templateMethod()：
     *         模板方法
     */
    public void make() {
        this.makeHead();
        this.makeBody();
        this.makeTail();
    }

}
