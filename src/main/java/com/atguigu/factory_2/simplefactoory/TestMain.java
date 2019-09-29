package com.atguigu.factory_2.simplefactoory;


/**
 * 简单工厂模式(静态工厂方法模式)
 */
public class TestMain {

    /**
     * 普通的方式：不推荐
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) {
//
//        Fruit apple = new Apple();
//        Fruit banana = new Banana();
//        apple.get();
//        banana.get();
//    }


    /**
     * 第一种方式：不推荐
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) {
//        Fruit apple = FruitFactory.getApple();
//        Fruit banana = FruitFactory.getBanana();
//        apple.get();
//        banana.get();
//    }


    /**
     * 第二种方式：推荐
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) throws Exception {
//
//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banana = FruitFactory.getFruit("banana");
//        apple.get();
//        banana.get();
//    }


    /**
     * 第三种方式：不推荐
     * @param args
     * @throws Exception
     */
//    public static void main(String[] args) throws Exception {
//
//        Fruit apple = FruitFactory.getFruit("apple");
//        Fruit banana = FruitFactory.getFruit("banana");
//        apple.get();
//        banana.get();
//    }

    /**
     * 第四种方式：推荐
     * @param args
     * @throws Exception
     */
    public static void main (String[] args) throws Exception {

        Fruit apple = FruitFactory.getFruit(Apple.class);
        Fruit banana = FruitFactory.getFruit(Banana.class);
        apple.get();
        banana.get();
    }

}

