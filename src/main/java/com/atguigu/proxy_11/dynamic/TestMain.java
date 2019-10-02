package com.atguigu.proxy_11.dynamic;

/**
 * 设计模式 11 ：代理模式
 *
 * 方式二 ：
 *      jdk动态代理
 *
 */
public class TestMain {

    public static void main(String[] args) {

        /**
         * 1；创建目标对象
         */
        ITeacherDao target = new TeacherDao();

        /**
         * 2：给目标对象，创建代理对象, 可以转成 ITeacherDao
         */
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        /**
         * 3：proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
         */
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        /**
         * 4：通过代理对象，调用目标对象的方法
         */
        proxyInstance.teach();

        proxyInstance.sayHello(" tom ");
    }

}
