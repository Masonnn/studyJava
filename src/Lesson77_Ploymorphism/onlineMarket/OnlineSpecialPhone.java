package Lesson77_Ploymorphism.onlineMarket;

import Lesson77_Ploymorphism.superMarket.Phone;

public class OnlineSpecialPhone extends Phone {

    /**
     * @param name
     * @param id
     * @param count
     * @param soldPrice
     * @param purchasePrice
     * @param screenSize
     * @param cpuHZ
     * @param memoryG
     * @param storageG
     * @param brand
     * @param os
     */
    public OnlineSpecialPhone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
    }

    // >> TODO 子类覆盖父类的方法，不可以用可见性更低的修饰符，但是可以用更高的修饰符
    // >> TODO 原因是什么呢？
    public String getNameOfPhone() {
        return super.getNameOfPhone();
    }
}
