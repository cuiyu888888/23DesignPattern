package com.atguigu.visitor_14;

/**
 * 具体的访问者
 */
public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人给的评价该歌手失败 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人给的评价该歌手失败 !");
    }

}
