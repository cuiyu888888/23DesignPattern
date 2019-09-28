package com.atguigu.principle.ocp_5.improve;


/**
 * 设计模式的原则 5：开闭原则
 *
 * 方式二：
 *      遵守对开闭原则，对扩展开放、对修改关闭
 *
 * 解决：
 *      更改Shape基类，修改为一个抽象类
 *      当新增加一个画三角形的功能类时，不更改绘制图形的使用者，既GraphicEditor、中的drawShape（）方法。
 */
public class Ocp2 {

    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }

}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor {

    /**
     * 接收Shape对象，调用draw方法
     */
    public void drawShape(Shape s) {
        s.draw();
    }


}

/**
 * Shape类，基类
 *
 * 更改为一个抽象类，并增加一个新的抽象方法draw（）
 */
abstract class Shape {
    //抽象方法
    public abstract void draw();

}

/**
 * 绘制矩形
 */
class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

/**
 * 绘制圆形
 */
class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

/**
 * 新增画三角形
 */
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * 新增一个图形
 */
class OtherGraphic extends Shape {

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}
