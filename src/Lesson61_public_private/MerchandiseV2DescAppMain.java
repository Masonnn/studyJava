package Lesson61_public_private;

import Lesson61_public_private.supermarket.MerchandiseV2;

public class MerchandiseV2DescAppMain {
    public static void main(String[] args) {
        // >> TODO 非共有的类，不能在包外被使用
        // NonPublicClassCanUseAnyName asd;
        MerchandiseV2 merchandise =
                new MerchandiseV2("书桌", "DESK9527", 40, 999.9, 500);

//        MerchandiseV2.createMerchandise("书桌", "DESK9527", 40, 999.9, 500);
        merchandise.describe();

    }
}
