package com.atguigu.mediator_17;


/**
 * 设计模式 17：中介者模式
 *
 * 一、什么是中介者模式
 *      Mediator模式也叫中介者模式，是由GoF提出的23种软件设计模式的一种。Mediator模式是行为模式之一，
 *      在Mediator模式中，类之间的交互行为被统一放在Mediator的对象中，对象通过Mediator对象同其他对象交互，Mediator对象起着控制器的作用。
 *
 * 二、中介者模式的角色和职责
 *      Mediator :中介者抽象父类。
 *      concreteMediator :具体的中介者类。
 *      colleague:关联类的抽象父类。
 *      concreteColleague :具体的关联类。
 *
 *  三、中介者模式的优点
 *      1，将系统按功能分割成更小的对象，符合类的最小设计原则
 *      2，对关联对象的集中控制
 *      3，减小类的耦合程度，明确类之间的相互关系：当类之间的关系过于复杂时，其中任何一个类的修改都会影响到其他类，
 *          不符合类的设计的开闭原则 ，而Mediator模式将原来相互依存的多对多的类之间的关系简化为Mediator控制类与其他关联类的一对多的关系，
 *          当其中一个类修改时，可以对其他关联类不产生影响（即使有修改，也集中在Mediator控制类）。
 *      4，有利于提高类的重用性
 *
 */
public class TestMain {
    public static void main(String[] args) {
        // 创建中介者
        Mediator mediator = new ConcreteMediator();

        // 创建关联对象
        Person zhangsna = new Man("张三", 0,7, mediator);
        Person lishi = new Man("李四", 1,7, mediator);
        Person xiaofang = new Woman("小芳", 1,7, mediator);

        // 将关联对象添加到中介者中
        mediator.addPerson(zhangsna);
        mediator.addPerson(lishi);
        mediator.addPerson(xiaofang);

        // 获取合适的对象
        zhangsna.getMediator().getPartner(zhangsna);
    }
}
