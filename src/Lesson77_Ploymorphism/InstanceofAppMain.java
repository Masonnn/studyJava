package Lesson77_Ploymorphism;

import Lesson77_Ploymorphism.superMarket.LittleSuperMarket;
import Lesson77_Ploymorphism.superMarket.MerchandiseV2;
import Lesson77_Ploymorphism.superMarket.Phone;

public class InstanceofAppMain {
    public static void main(String[] args) {
        int mNum = 600;
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket("佳佳超市", "溜光大道", 50, mNum, 100);

        // >> TODO instanceof 操作符，可以判断一个引用指向的对象是否是某一个类型或者其子类
        //    TODO 是则返回true，否则返回false
        for (int i = 0; i < mNum; i++) {
            MerchandiseV2 m = null;//littleSuperMarket.getMerchandiseOf(i);
            if (m instanceof Phone) {
                // TODO 先判断，再强制类型转换，比较安全
                Phone ph = (Phone) m;
                System.out.println(ph.getName());
            } else {
//                System.out.println("not an instance");
            }
            // >> TODO 如果引用是null，则肯定返回false

        }
    }
}
