package Lesson77_Ploymorphism.superMarket;

public class LittleSuperMarket {
    private String superMarketName;
    private String address;
    private int parkingCount;
    private double incomingSum;
    private MerchandiseV2[] merchandises;
    private int[] merchandiseSold;

    /**
     * 小超市初始化
     *
     * @param superMarketName
     * @param address
     * @param parkingCount
     * @param merchandiseCount 商品种类数
     * @param count            每种商品缺省库存
     */

    public LittleSuperMarket(String superMarketName, String address, int parkingCount, int merchandiseCount, int count) {
        this.superMarketName = superMarketName;
        this.address = address;
        this.parkingCount = parkingCount;

        MerchandiseV2 giftForPhone = new MerchandiseV2("手机赠品-64G存储卡", "GIFT001", 999, 60, 30);

        merchandises = new MerchandiseV2[merchandiseCount];
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = null;
            if (i > 0 & i % 100 == 0) {
                m = new ShellColorChangePhone(
                        "商品" + i,
                        "ID" + i,
                        count,
                        1999,
                        999,
                        giftForPhone,
                        4.5,
                        3.5,
                        4,
                        128,
                        "三星",
                        "Android"
                );
            } else if (i > 0 & i % 10 == 0) {
                m = new Phone(
                        "商品" + i,
                        "ID" + i,
                        count,
                        1999,
                        999,
                        giftForPhone,
                        4.5,
                        3.5,
                        4,
                        128,
                        "Apple",
                        "iOS"
                );
            } else {
                double purchasePrice = Math.random() * 200;
                m = new MerchandiseV2(
                        "商品" + i,
                        "ID" + i,
                        count,
                        purchasePrice * (1 + Math.random()),
                        purchasePrice
                );
            }
            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            merchandises[i] = m;
        }
        merchandiseSold = new int[merchandises.length];

    }


    public String getSuperMarketName() {
        return superMarketName;
    }

    public void setSuperMarketName(String superMarketName) {
        this.superMarketName = superMarketName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getParkingCount() {
        return parkingCount;
    }

    public void setParkingCount(int parkingCount) {
        this.parkingCount = parkingCount;
    }

    public double getIncomingSum() {
        return incomingSum;
    }

    public void setIncomingSum(double incomingSum) {
        this.incomingSum = incomingSum;
    }

    public MerchandiseV2[] getMerchandises() {
        return merchandises;
    }

    public void setMerchandises(MerchandiseV2[] merchandises) {
        this.merchandises = merchandises;
    }

    public int[] getMerchandiseSold() {
        return merchandiseSold;
    }

    public void setMerchandiseSold(int[] merchandiseSold) {
        this.merchandiseSold = merchandiseSold;
    }
    // 一些特殊的逻辑

    /**
     * 得到进价最高的商品
     *
     * @return
     */
    public double getBiggestPurchasePrice() {
        double maxPurchasePrice = -1;

        for (MerchandiseV2 m : merchandises) {
            if (m.getPurchasePrice() > maxPurchasePrice) {
                maxPurchasePrice = m.getPurchasePrice();
            }
        }
        return maxPurchasePrice;
    }


    /**
     * 得到利润最高的商品
     *
     * @return
     */
    public MerchandiseV2 getBiggestProfitMerchandise() {
        MerchandiseV2 curr = null;
        for (int i = 0; i < merchandises.length; i++) {
            MerchandiseV2 m = merchandises[i];
            if (curr == null || curr.calculateProfit() < m.calculateProfit()) {
                curr = m;
            }
        }
        return curr;
    }

    /**
     * 根据索引获取商品
     *
     * @param merchandiseIndex
     * @return
     */

    public MerchandiseV2 getMerchandiseOf(int merchandiseIndex) {
        if (merchandiseIndex < 0 || merchandiseIndex >= merchandises.length) {
            return null;
        }
        return merchandises[merchandiseIndex];
    }


    /**
     * 赚钱
     *
     * @param toBeAdded
     */
    public void addIncomingSum(double toBeAdded) {
        this.incomingSum += toBeAdded;
    }

    /**
     * 花钱
     *
     * @param toBeSpent
     * @return
     */
    public boolean spendMoney(double toBeSpent) {
        if (toBeSpent > incomingSum) {
            return false;
        }
        incomingSum -= toBeSpent;
        return true;
    }

}
