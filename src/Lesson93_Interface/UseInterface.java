package Lesson93_Interface;

import Lesson93_Interface.superMarket.ExpireDateMerchandise;

import java.util.Date;

public class UseInterface {
    public static void main(String[] args) {
        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);



    }
}
