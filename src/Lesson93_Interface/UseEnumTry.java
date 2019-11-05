package Lesson93_Interface;


import Lesson93_Interface.supermarket.CategoryTry;

import java.util.Scanner;

public class UseEnumTry {
    public static void main(String[] args) {
        // >> TODO 获取所有枚举，看看枚举实例有哪些方法
        for (CategoryTry categoryTry : CategoryTry.values()) {
            System.out.println("==================" + categoryTry.getId() + "=================");
            // 获取索引？
            System.out.println(categoryTry.ordinal());
            System.out.println(categoryTry.name());
            System.out.println(categoryTry.toString());
            System.out.println(CategoryTry.values().toString());

        }


        System.out.println();
        // >> TODO 根据名字获取枚举
        System.out.println(CategoryTry.valueOf("FOOD"));
//        System.out.println(Category.valueOf("food"));

        Scanner in = new Scanner(System.in);
        System.out.println("========请输入 第1个 枚举的名字=========");
        String categoryName = in.next();
        CategoryTry enumInput = CategoryTry.valueOf(categoryName.trim().toUpperCase());
        System.out.println("枚举的信息 ： " + enumInput.toString());


        System.out.println("========请输入 第2个 枚举的名字=========");
        String categoryName2 = in.next();
        CategoryTry enumInput2 = CategoryTry.valueOf(categoryName2.trim().toUpperCase());
        System.out.println("第2个 枚举的信息 ： " + enumInput2.toString());


        System.out.println(enumInput == enumInput2);

    }
}
