package Lesson77_Ploymorphism.superMarket;

import java.util.Objects;

public class MerchandiseV2 {
    public String name;
    private String id;
    private int count;
    private double soldPrice;
    private double purchasePrice;


    public MerchandiseV2(String name, String id, int count, double soldPrice, double purchasePrice) {
        this.name = name;
        this.id = id;
        this.count = count;
        this.purchasePrice = purchasePrice;
        this.soldPrice = soldPrice;
    }


    public MerchandiseV2() {
        this("无名", "000", 0, 1, 1.1);
    }

    public void describe() {
        System.out.println("商品名字是 " + name + ", id是 " + id + "。商品售价是 "
                + soldPrice + "。商品进价是 " + purchasePrice + "。商品库存是 "
                + count + "。销售一个的毛利润是 " + calculateProfit());
    }

    /**
     * 计算利润
     *
     * @return
     */
    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        return profit;
    }

    /**
     * buy方法, 传int类型参数
     *
     * @param count
     * @return
     */
    public double buy(int count) {
        System.out.println("Merchandise里的buy(int count)");
        if (this.count < count) {
            System.out.println("库存不足");
            return -1;
        }
        this.count -= count;
        double cost = count * soldPrice;
        System.out.println("购买成功，话费为" + cost);
        return cost;
    }

    /**
     * buy方法重载（overload），传boolean类型
     *
     * @param reallyBuy
     * @return
     */
    public double buy(boolean reallyBuy) {
        System.out.println("Merchandise里的buy(boolean reallyBuy)");
        if (reallyBuy) {
            return this.buy(1);
        } else {
            return -1;
        }
    }

    // >> TODO hashCode 和 equals是我们最常覆盖的两个方法
    // >> TODO 覆盖的原则是，equals为true，hashCode就应该相等。这是一种约定俗成的规范
    // >> TODO 即equals为true是hashCode相等的充分非必要条件，hashCode相等是equals为true的必要不充分条件


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MerchandiseV2)) return false;
        MerchandiseV2 that = (MerchandiseV2) o;
        return this.getCount() == that.getCount() &&
                Double.compare(that.getSoldPrice(), getSoldPrice()) == 0 &&
                Double.compare(that.getPurchasePrice(), getPurchasePrice()) == 0 &&
                getName().equals(that.getName()) &&
                getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getCount(), getSoldPrice(), getPurchasePrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(double soldPrice) {
        this.soldPrice = soldPrice;
    }

    public static void staticMethod() {
        System.out.println("staticMethod in MerchandiseV2");
    }
}
