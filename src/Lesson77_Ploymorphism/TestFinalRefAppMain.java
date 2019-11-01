package Lesson77_Ploymorphism;

import Lesson77_Ploymorphism.superMarket.LittleSuperMarket;
import Lesson77_Ploymorphism.superMarket.MerchandiseV2;
import Lesson77_Ploymorphism.superMarket.Phone;

public class TestFinalRefAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("佳佳超市","武胜路",5,600,100);
        Phone ph = (Phone) superMarket.getMerchandiseOf(10);

        MerchandiseV2 gift = ph.getGift();

        gift.describe();

        gift.setName("变化商品名字");

        gift.setSoldPrice(9898989);

        gift.describe();
        MerchandiseV2 m0 = superMarket.getMerchandises()[0];

        superMarket.getMerchandises()[0] = gift;

        MerchandiseV2 m0Change = superMarket.getMerchandises()[0];

        m0.describe();

        m0Change.describe();



    }
}
