package com.atguigu.prototype_3.deepclone;


import java.io.*;

/**
 * 被克隆的对象,需要实现Cloneable接口，并重写clone()方法,实现Serializable接口
 *
 * 完成深clone
 */
public class Person implements Cloneable, Serializable {

    public Person() {
    }

    public Person(String name, int age, Friend friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

    private String name;
    private int age;
    private Friend friend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", Friend=" + friend.getName() +
                '}';
    }

    /**
     * 深拷贝 - 方式 1 使用clone 方法
     */
    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        //对引用类型的属性，进行单独处理
        person.friend = friend.clone();
        return person;
    }


    /**
     * 深拷贝 - 方式2 通过对象的序列化实现 (推荐)
     */
    public Person clone2() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            /**
             * 序列化
             */
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Person person = (Person) ois.readObject();
            return person;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
