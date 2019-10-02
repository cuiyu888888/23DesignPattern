package com.atguigu.template_12;


/**
 * ConcreteClass：
 *      具体的实现子类
 */
public class MakeJeep extends MakeCar {

    public void makeBody() {
        System.out.println("jeep:组装车身");
    }

    public void makeHead() {
        System.out.println("jeep:组装车头");
    }

    public void makeTail() {
        System.out.println("jeep:组装车尾");
    }

}

