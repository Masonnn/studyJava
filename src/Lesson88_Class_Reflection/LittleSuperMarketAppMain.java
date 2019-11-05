package Lesson88_Class_Reflection;

import Lesson88_Class_Reflection.supermarket.LittleSuperMarket;

public class LittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        superMarket.getBiggestProfitMerchandise().describe();
    }
}
