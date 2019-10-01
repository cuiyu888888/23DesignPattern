package com.atguigu.facade_9;


/**
 * 设计模式 9：外观模式
 */
public class TestMain {

    public static void main(String[] args) {

        Facade homeTheaterFacade = new Facade();
        homeTheaterFacade.ready();

        homeTheaterFacade.play();

        homeTheaterFacade.end();
    }

}

