package com.atguigu.principle.inversion_3.improve;

/**
 * 依赖关系传递的三种方式和应用案例
 *
 * 1) 接口传递
 * 2) 构造方法传递
 * 3) setter 方式传递
 */
public class DependencyPass {

    public static void main(String[] args) {
        //接口传递
        ITV changHong = new ChangHong();
//        IOpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        //通过构造器进行依赖传递
//        IOpenAndClose openAndClose = new OpenAndClose(changHong);
//        openAndClose.open();

        //通过setter方法进行依赖传递
        IOpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();

    }

}

/**
 * 方式1： 通过接口传递实现依赖
 */
/**
 * ITV接口
 */
//interface ITV {
//    public void play();
//}
//
///**
// * ITV接口的实现类
// */
//class ChangHong implements ITV {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//
//}
//
///**
// * 开关的接口
// */
//interface IOpenAndClose {
//    public void open(ITV tv); //抽象方法,接收接口
//}
//
///**
// * 开关接口的实现
// */
//
//class OpenAndClose implements IOpenAndClose {
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

//====================================================

/**
 * 方式2: 通过构造方法依赖传递
 */
/**
 * ITV接口
 */
//interface ITV {
//    public void play();
//}
//
///**
// * ITV接口的实现类
// */
//class ChangHong implements ITV {
//
//    @Override
//    public void play() {
//        System.out.println("长虹电视机，打开");
//    }
//
//}
//
///**
// * 开关的接口
// */
//interface IOpenAndClose {
//    public void open();
//}
//
///**
// * 开关的接口的实现类
// */
//class OpenAndClose implements IOpenAndClose {
//    public ITV tv; //成员
//
//    public OpenAndClose(ITV tv) { //构造器
//        this.tv = tv;
//    }
//
//    public void open() {
//        this.tv.play();
//    }
//}


/**
 * 方式3 , 通过setter方法传递
 */
/**
 * ITV接口
 */
interface ITV {
    public void play();
}

/**
 * ITV接口的实现类
 */
class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }

}

/**
 * 开关的接口
 */
interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);
}

/**
 * 开关的接口的实现类
 */
class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}

