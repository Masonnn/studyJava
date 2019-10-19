package Lesson59_static;

import Lesson59_static.supermarket.MerchandiseV2WithStaticVariable;
import static Lesson59_static.supermarket.MerchandiseV2WithStaticVariable.*;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        MerchandiseV2WithStaticVariable merchandiseV2WithStaticVariable =  new MerchandiseV2WithStaticVariable("书桌","DESK9527",40,999.9,500);

        merchandiseV2WithStaticVariable.describe();

        // >> TODO 使用import static来引入一个静态变量，就可以直接用静态变量名访问了
        //    TODO import static也可以使用通配符*来引入一个类里所有静态变量
        System.out.println(DISCOUNT_FOR_VIP);
    }

}
