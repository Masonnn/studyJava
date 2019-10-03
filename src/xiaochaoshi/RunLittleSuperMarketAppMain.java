package xiaochaoshi;

import xiaochaoshi.person.Customer;
import xiaochaoshi.supermarket.LittleSuperMarket;
import xiaochaoshi.supermarket.MerchandiseV2;

import java.util.Scanner;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        //
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        //
        littleSuperMarket.superMarketName = "佳佳超市";
        littleSuperMarket.address = "武圣路";
        littleSuperMarket.parkingCount = 10;
        //
        littleSuperMarket.merchandises = new MerchandiseV2[100];
        //
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        //
        MerchandiseV2[] all = littleSuperMarket.merchandises;


        for (int i = 0; i < all.length; i++) {
            //
            MerchandiseV2 m = new MerchandiseV2();
            m.name = "商品" + i;
            m.count = 100;
            m.purchasePrice = Math.random() * 100;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            m.id = "ID" + i;
            m.madeIn = "China" + i;
            all[i] = m;
//            m.describle();
        }

        // 每满2件商品，第二件商品半价



        System.out.println("营业中，欢迎光临……");
        boolean open = true;
        Scanner in = new Scanner(System.in);
        while (open) {
            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("地址在" + littleSuperMarket.address);
            System.out.println("有" + littleSuperMarket.parkingCount + "个停车位");
            System.out.println("今天的营业额为" + littleSuperMarket.incomingSum);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + ((int) (Math.random() * 100000000));
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;


            //
            //
            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("Welcome" + customer.name + "驾车而来。本店已经为您安排了车位，停车免费哦。车位编号为" + littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount -= 1;
                } else {
                    System.out.println("不好意思，车位已满。");
                    continue;
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临本店");
            }

            //接待此顾客
            double totalCost = 0;
            while (true) {
                //
                System.out.println("本店提供" + littleSuperMarket.merchandises.length + "种商品，请输入您要购买的商品编号：");
                int merchandiseId = in.nextInt();
                //
                if (merchandiseId < 0) {
                    System.out.println("您本次购买了" + totalCost + "元的商品。欢迎您再次光临。");
                    break;
                }

                //
                // 商品没有，让顾客继续选择
                if (merchandiseId >= littleSuperMarket.merchandises.length) {
                    System.out.println("此商品本店没有，欢迎继续挑选");
                    continue;
                }

                // 商品有，问顾客要购买多少个
                MerchandiseV2 toBuy = littleSuperMarket.merchandises[merchandiseId];
                System.out.println(toBuy.name + "单价" + toBuy.soldPrice + "。请问您买几个？");

                int numToBuy = in.nextInt();

                if (numToBuy <= 0) {
                    System.out.println("谢谢光临，不买看看也好，欢迎继续选购");
                    continue;
                }

                if (toBuy.count < numToBuy) {
                    System.out.println(toBuy.name + "只有" + toBuy.count + "件了，不够" + numToBuy + "。欢迎继续选购");
                    continue;
                }

                // 钱也够，货也够
                // 更新顾客此次消费的总额
                totalCost += toBuy.count * toBuy.soldPrice;
                // 更新商品库存
                toBuy.count -= numToBuy;
                // 更新今日销货数据
                littleSuperMarket.merchandiseSold[merchandiseId] += numToBuy;

            }
            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }

            customer.money -= totalCost;
            littleSuperMarket.incomingSum += totalCost;
            System.out.println(customer.name + "共消费" + totalCost + "。欢迎再次光临。");

            System.out.println("是否继续营业？");
            open = in.nextBoolean();
            if (open != true) {
                System.out.println("输入错误，退出");
                open = false;
            }
        }

        System.out.println("超市关门了！");

        System.out.println("今日销售额为" + littleSuperMarket.incomingSum + "。营业统计如下：");

        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            int sold = littleSuperMarket.merchandiseSold[i];
            if (sold > 0) {
                MerchandiseV2 m = littleSuperMarket.merchandises[i];
                double netIncoming = sold * (m.soldPrice - m.purchasePrice);
                double incoming = sold * m.soldPrice;
                System.out.println(littleSuperMarket.merchandises[i].name + "售出" + sold + "个。销售额" + incoming + "。毛利润" + netIncoming);
            }

        }

        System.out.println("下面有请利润最高的商品做自我介绍");
        // >> TODO 返回值可以直接使用，不必赋值给一个变量再使用。
        littleSuperMarket.getBiggestProfitMerchandise().describe();

    }
}
