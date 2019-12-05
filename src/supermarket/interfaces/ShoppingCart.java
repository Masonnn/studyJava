package supermarket.interfaces;

import java.util.Arrays;

public class ShoppingCart {
    private Merchandise[] buy;
    private int[] count;
    private int curr;
    private int max;

    public ShoppingCart(int maxTypeToBuy) {
        buy = new Merchandise[maxTypeToBuy];
        count = new int[maxTypeToBuy];
        max = maxTypeToBuy;
        curr = 0;
    }

    public boolean canHold() {
        return curr < max;
    }

    public boolean add(Merchandise m, int countToBuy) {
        if (!canHold()) {
            return false;
        }
        buy[curr] = m;
        this.count[curr] = countToBuy;

        curr++;
        m.buy(countToBuy);
        return true;
    }

    public double calculateOriginCost() {
        double ret = 0;
        int pos = -1;
        for (Merchandise m : buy) {
            pos++;
            if (m == null) {
                continue;
            }

            ret += m.getPurchasePrice() * count[pos];
        }
        return ret;

    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "buy=" + Arrays.toString(buy) +
                ", count=" + Arrays.toString(count) +
                ", curr=" + curr +
                ", max=" + max +
                '}';
    }
}
