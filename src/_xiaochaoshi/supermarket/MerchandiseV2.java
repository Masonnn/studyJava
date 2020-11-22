package _xiaochaoshi.supermarket;

public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;
    public String madeIn;

    //
    public void describe() {
        System.out.println("商品名字叫做" + name + "，id是" + id + "。 商品售价是" + soldPrice
                + "。商品进价是" + purchasePrice + "。商品库存量是" + count +
                "。销售一个的毛利润是" + (soldPrice - purchasePrice));
    }

    //  计算利润
    public double calculateProfit() {
        double profit = soldPrice - purchasePrice;
        if (profit <= 0) {
            return 0;
        }
        return profit;
    }

    // 第2件商品半价

    // >> TODO 参数是定义在方法名字后面的括号里的
    // >> TODO 参数定义的规范和变量一样，都是类型名字加标识符，这里的标识符我们叫做参数名。
    // >> TODO 方法体中的代码可以使用参数
    // >> TODO 参数的值在调用方法的时候需要给出，有的资料叫做实参（实际参数）
    //    TODO 对应的，方法定义这里的参数，叫做形参（形式参数）
    // 如果返回值是负数，就代表购买失败，比如库存不足
    public double buy(int countToBuy) {
        if (count < countToBuy) {
            System.out.println("库存不足");
            return -1;
        }

        System.out.println("商品单价为" + soldPrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = fullPriceCount * soldPrice + halfPriceCount * soldPrice / 2;

        count -= countToBuy;

        return totalCost;
    }

    // >> TODO 一个方法可以有多个参数，多个参数之间用逗号隔开

    /**
     *
     * @param countToBuy
     * @param printLeft
     * @return
     */
    public double buyAndPrintLeft(int countToBuy, boolean printLeft) {
        if (count < countToBuy) {
            System.out.println("商品库存不足");
            if (printLeft) {
                System.out.println("商品剩余库存为" + count);
            }
            return -1;
        }

        System.out.println("商品单价为" + soldPrice);

        int fullPriceCount = countToBuy / 2 + countToBuy % 2;
        int halfPriceCount = countToBuy - fullPriceCount;
        double totalCost = fullPriceCount * soldPrice + halfPriceCount * soldPrice / 2;

        count -= countToBuy;

        if (printLeft) {
            System.out.println("商品剩余库存为" + count);
        }
        return totalCost;

    }

    // >> TODO 参数可以是任何类型，包括自定义类型，甚至是自己的类型都没问题
    public boolean totalValueBiggerThan(MerchandiseV2 merchandiseV2) {
        return count * soldPrice > merchandiseV2.soldPrice * merchandiseV2.count;
    }

    // >> TODO 参数可以是任何类型，包括自定义类型
    public boolean isTheBiggestTotalValueOne(LittleSuperMarket littleSuperMarket){
        double totalValue = count * soldPrice;
        for (int i = 0; i<littleSuperMarket.merchandises.length;i++){
            MerchandiseV2 m = littleSuperMarket.merchandises[i];
            double newTotalValue = m.count * m.soldPrice;
            if (totalValue < newTotalValue){
                // 执行到return的时候，方法直接结束，不管是不是在循环中，是在第几层循环中。
                return false;
            }
        }
        return true;
    }


}


























