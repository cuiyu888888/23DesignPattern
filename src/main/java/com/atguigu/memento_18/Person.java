package com.atguigu.memento_18;


/**
 * Originator（原生者）：
 *      需要被保存状态以便恢复的那个对象。
 */
public class Person {

    private String name;
    private String sex;
    private int age;

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 创建一个备份
     */
    public Memento saveMemento(){
        return new Memento(name, sex, age);
    }

    /**
     * 恢复备份
     */
    public void restoreMemento(Memento memento){
        this.name = memento.getName();
        this.sex = memento.getSex();
        this.age = memento.getAge();
    }
}

