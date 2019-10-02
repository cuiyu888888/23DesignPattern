package com.atguigu.iterator_15;/**
 * @Author 崔雨
 * @Date 2019/10/2 23:50
 * @Description: ${todo}
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: 23DesignPattern
 * @description:
 * @author: Mr.Wang
 * @create: 2019-10-02 23:50
 **/
public class InfoCollege implements College {

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }

}
