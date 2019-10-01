package com.atguigu.flyweight_10;

/**
 * 具体的享元对象
 */
public class ConcreteWebSite extends WebSite {

    /**
     * 共享的部分，内部状态
     */
    private String type = ""; //网站发布的形式(类型)


    public ConcreteWebSite(String type) {
        this.type = type;
    }


    /**
     * 私有的部分，外部状态
     */
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }

}
