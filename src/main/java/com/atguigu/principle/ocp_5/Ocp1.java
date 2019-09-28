package com.atguigu.principle.ocp_5;

/**
 * 设计模式的原则 5：开闭原则
 *
 * 方式一：
 * 	违背了对开闭原则，对扩展开放、对修改关闭
 *
 * 问题：
 * 	    当新增加一个画三角形的功能类时，还需要更改绘制图形的使用者，既GraphicEditor、中的drawShape（）方法。
 * 	    应该在新增加功能的同时，不应该更改适用方的现有代码，违背了开放原则
 */
public class Ocp1 {

    public static void main(String[] args) {
        /**
         * 使用看看存在的问题
         */
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

/**
 * 这是一个用于绘图的类 [使用方]
 */
class GraphicEditor {

    /**
     * 接收Shape对象，然后根据type，来绘制不同的图形
     *
     * 当增加一个新的功能：绘制一个新的三角形、这时候需要修改"使用方"的代码
     */
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        else if (s.m_type == 3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形 ");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形 ");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * 画图的基类
 *
 * Shape类，基类
 */
class Shape {
    int m_type;
}

// 画矩形
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

// 画三角形
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
