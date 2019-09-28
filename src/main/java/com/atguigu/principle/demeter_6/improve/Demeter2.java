package com.atguigu.principle.demeter_6.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 设计模式的原则 6：迪米特原则
 *
 * 方式2:解决问题
 *
 *      分析将输出学院员工信息的方法，放到学院员工管理类CollegeManager自己的内部
 */
public class Demeter2 {

    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
        //输出学院的员工id 和  学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());

    }

}

/**
 * 学院的员工类
 */
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

/**
 * 管理学院员工的管理类
 *
 * 将输出学院员工信息的方法，放到学院员工管理类CollegeManager自己的内部
 */
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();

        //这里我们增加了10个员工到 list
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 该方法完成输出学院员工信息(id)
     */
    void printAllEmployee() {

        /**
         * 获取到学院员工
         */
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }

}

/**
 * 学校总部员工类
 */
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


/**
 * 学校管理类
 */
class SchoolManager {
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        //这里我们增加了5个员工到 list
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    /**
     * 该方法完成输出学校总部和学院员工信息(id)
     */
    void printAllEmployee(CollegeManager sub) {

        /**
         * 输出学院员工信息id
         */
        sub.printAllEmployee();

        /**
         * 获取到学校总部员工
         */
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
