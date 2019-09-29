package com.atguigu.factory_2.simplefactoory;

/**
 * 简单工厂模式：工厂类
 */
public class FruitFactory {

    /**
     * 第一种方式：不推荐
     */
//    public static Fruit getApple(){
//        return new Apple();
//    }
//    public static Fruit getBanana(){
//        return new Banana();
//    }

    /**
     * 第二种方式：推荐
     */
//     public static Fruit getFruit(String type) throws Exception {
//        if(type.equalsIgnoreCase("apple")){
//            return Apple.class.newInstance();
//        }else if (type.equalsIgnoreCase("banana")){
//            return Banana.class.newInstance();
//        }else{
//            System.out.println("没有获取的类型");
//            return null;
//        }
//
//    }

    /**
     * 第三种方式：不推荐
     */
//    public static Fruit getFruit(String type) throws Exception{
//
//        Class<?> fruit = Class.forName(type);
//        return (Fruit) fruit.newInstance();
//    }

    /**
     * 第四种方式：推荐
     */
    public static Fruit getFruit(Class type) throws Exception{
        return (Fruit) type.newInstance();
    }

}


