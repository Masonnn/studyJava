package Lesson54_overload.com;

import Lesson54_overload.com.supermarket.MerchandiseV2;

public class MerchandiseV2AppMain {
    public static void main(String[] args) {
        MerchandiseV2 merchandiseV2 = new MerchandiseV2();

        merchandiseV2.init("书桌", "Desk-7527", 40, 999.9,500);

        int count = 3;

        System.out.println("==============测试使用不完全匹配的参数调用重载方法=============");

        // >> TODO 依次使用byte, short, int, long, float, double 类型的参数调用buy方法，哪个方法会被调用呢？
        // >> TODO 无论是否重载参数类型 可以不完全匹配的规则是"实参数可以自动类型转换成形参类型"
        // >> TODO 重载的特殊之处是，参数满足自动自动类型转换的方法有好几个，重载的规则是选择最"近"的去调用

        float countForOverride = 11;
        merchandiseV2.buy(countForOverride);
    }
}