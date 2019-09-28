package com.atguigu.principle.inversion_3.improve;


/**
 * 设计模式的原则 3：依赖倒转(倒置)原则
 *
 * 方式二：引入一个抽象的接口IReceiver, 表示接收者, 这样Person类与接口IReceiver发生依赖
 *        因为Email, WeiXin 等等属于接收的范围，他们各自实现IReceiver 接口就ok, 这样我们就符号依赖倒转原则
 */
public class DependecyInversion2 {

    public static void main(String[] args) {
        //客户端无需改变
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }

}

/**
 * 定义接口
 */
interface IReceiver {
    public String getInfo();
}

/**
 * 增加接口的实现类：Email
 */
class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

/**
 * 增加接口的实现类：微信
 */
class WeiXin implements IReceiver {
    public String getInfo() {
        return "微信信息: hello,ok";
    }
}

/**
 * 方式2
 */
class Person {
    //这里我们是对接口的依赖
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
