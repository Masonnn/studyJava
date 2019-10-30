package Lesson77_Ploymorphism.superMarket;

public class ShellColorChangePhone extends Phone {

    private boolean enableShellColorChange;

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
    public ShellColorChangePhone(String name, String id, int count, double soldPrice, double purchasePrice, double screenSize, double cpuHZ, int memoryG, int storageG, String brand, String os) {
        super(name, id, count, soldPrice, purchasePrice, screenSize, cpuHZ, memoryG, storageG, brand, os);
        enableShellColorChange = false;

    }

    public boolean isEnableShellColorChange() {
        return enableShellColorChange;
    }

    public void setEnableShellColorChange(boolean enableShellColorChange) {
        this.enableShellColorChange = enableShellColorChange;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("壳色随着屏幕色变的功能开启状态" + enableShellColorChange);
    }

    @Override
    public double calculateProfit() {
        double profit = super.calculateProfit();
        return profit + profit * 0.1;
    }

    @Override
    public String getName(){
        return super.getName()+"-山寨机";
    }

}
