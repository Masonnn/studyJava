package Lesson93_Interface;

import Lesson93_Interface.supermarket.LittleSuperMarket;

public class LittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        superMarket.getBiggestProfitMerchandise().describe();
    }
}
