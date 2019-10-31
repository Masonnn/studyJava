package Lesson47_.superMarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。赠品是" + gift.name + "。价值" + gift.purchasePrice);
    }

    public double calculateProfit() {

        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return 0;
        }
        return profit;
    }

    // >> TODO 参数是定义在方法名字后面的括号里的
    // >> TODO 参数定义的规范和变量一样，都是类型名字加标识符，这里的标识符我们叫做参数名。
    // >> TODO 方法体中的代码可以使用参数
    // >> TODO 参数的值在调用方法的时候需要给出，有的资料叫做实参（实际参数）
    // >> TODO 对应的，方法定义这里的参数，叫做形参（形式参数）

    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("商品库存不足");
            return -1;
        }

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;

        double totalCost = soldPrice * fullPriceCount + halfPriceCount * soldPrice / 2;

        count -= countToBuy;

        return totalCost;

    }

    // >> TODO 一个方法可以有多个参数，多个参数之间用逗号隔开
    public double buyAndPrintLeft(int countToBuy, boolean printLeft) {
        if (count < countToBuy) {
            System.out.println("商品库存不够");
            if (printLeft) {
                System.out.println("商品剩余库存为" + count);
            }
            return -1;
        }

        System.out.println("商品单价为" + soldPrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = soldPrice * fullPriceCount + halfPriceCount * soldPrice / 2;

        count -= countToBuy;

        if (printLeft) {
            System.out.println("商品剩余库存为：" + printLeft);
        }

        return totalCost;
    }

    // >> TODO 参数可以是任何类型，包括自定义类型，甚至是自己的类型都没问题
    public boolean totalValueBiggerThan(MerchandiseV2 merchandiseV2) {
        return count * soldPrice > merchandiseV2.soldPrice * merchandiseV2.count;
    }

    // >> TODO 参数可以是任何类型，包括自定义类型，甚至是自己的类型都没问题
    public boolean isTheBiggestTotalValueOne(LittleSuperMarket littleSuperMarket) {
        double totalValue = count * soldPrice;

        for (int i = 0; i < littleSuperMarket.merchandises.length; i++) {
            MerchandiseV2 m = littleSuperMarket.merchandises[i];

            double newTotalValue = m.count * m.purchasePrice;
            if (totalValue < newTotalValue) {
                return false;
            }

        }
        return true;
    }
    // ---------------------------15. 分清参数、局部变量和实例变量地盘 新增加的内容---------------------------

    public MerchandiseV2 gift;

    public double getSoldPrice() {
        return soldPrice;
    }

    public String getName() {
        return name;
    }

    public MerchandiseV2 getGiftAndHowCanOutsideChangeIt() {
        return gift;
    }


    public void willOutsideValueChangeIfParameterValueChangeHereRef(MerchandiseV2 m2) {
        m2 = gift;
    }

    public void willOutsideValueChangeIfParameterValueChangeHerePrime(int intVal) {
        intVal = 99999999;
    }

    public void changeToTheSameGift(MerchandiseV2 m2) {
        m2.gift = gift;
    }

}