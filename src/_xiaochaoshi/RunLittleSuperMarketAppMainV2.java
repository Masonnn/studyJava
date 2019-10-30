package _xiaochaoshi;

import _xiaochaoshi.supermarket.LittleSuperMarket;
import _xiaochaoshi.supermarket.MerchandiseV2;

import java.util.Scanner;

/**
 * @author
 */
public class RunLittleSuperMarketAppMainV2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();

        littleSuperMarket.superMarketName = "佳佳超市";
        littleSuperMarket.address = "朝阳区武胜路";
        littleSuperMarket.parkingCount = 20;

        littleSuperMarket.merchandises = new MerchandiseV2[200];

        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        // 为了使用方便，创建一个 商品数组引用，和littleSuperMarket.merchandises指向同一个数组对象
        MerchandiseV2[] all = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.name = i + "号商品";
            m.count = 200;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;

            // 用创建的商品，给商品数组的第i个引用赋值，all和小超市的商品数组引用指向的是同一个数组对象
            all[i] = m;

        }

        // 创建一个Scanner读取输入
        Scanner scanner = new Scanner(System.in);
        MerchandiseV2 m0 = all[0];
        while (true) {
            System.out.println("今日超市大特惠，所有商品第二件半价！选择要购买的商品索引：");
            int index = scanner.nextInt();

            if (index < 0) {
                System.out.println("欢迎再次光临");
                break;
            }

            System.out.println("请输入要购买的数量：");
            int count = scanner.nextInt();

            MerchandiseV2 m = littleSuperMarket.merchandises[index];
            System.out.println("用户选择的商品是超市里价格最高的 " + m.isTheBiggestTotalValueOne(littleSuperMarket));

            double totalCost = m.buyAndPrintLeft(count, true);

            boolean m0BiggerThan = m0.totalValueBiggerThan(m);
            System.out.println("m0的总价值比用户选择的要大： " + m0BiggerThan);


            System.out.println("商品总价为：" + totalCost);

        }


    }
}
