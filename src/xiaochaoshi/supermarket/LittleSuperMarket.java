package xiaochaoshi.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public MerchandiseV2[] merchandises;
    public int[] merchandiseSold;

    //    public Merchandise getBiggestProfitMerchandise() {
//        Merchandise curr = null;
//
//        for (int i = 0; i < merchandises.length; i++) {
//            Merchandise m = merchandises[i];
//            if (curr == null) {
//                curr = m;
//            } else {
//                if (m.calculateProfit() > curr.calculateProfit()){
//                    curr = m;
//                }
//            }
//        }
//        return curr;
//    }
//
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

}
