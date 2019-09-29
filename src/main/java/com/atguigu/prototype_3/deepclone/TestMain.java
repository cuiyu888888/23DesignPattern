package com.atguigu.prototype_3.deepclone;


/**
 * 设计模式 3：原型模式
 *
 * 方式三：实现深拷贝
 *      深拷贝 - 方式 1 使用clone 方法
 *      深拷贝 - 方式2 通过对象的序列化实现 (推荐)
 *
 * 注意：克隆分为深度克隆和浅度克隆，
 *      浅度克隆：对于数字型的clone是可以的，但是对于对象的应用就不能够clone，要想达到对对象的clone，就需要深度clone。
 *      深度克隆：需要自己手动的在对对象进行clone才能达到深度clone.
 *
 */
public class TestMain {

    public static void main(String[] args) throws Exception{
        // 原本数据
        Person person = new Person("tom", 12, new Friend("高瑞"));

        // 被clone 的对象
        Person person1 = person.clone2();

        // 修改原本对象的属性，不会造成对已经clone对象属性值得改变
        person.setAge(15);
        person.getFriend().setName("杜康");


        System.out.println(person);
        System.out.println(person1);
        System.out.println(person == person1);
        System.out.println(person.getFriend() == person1.getFriend());

    }

}
