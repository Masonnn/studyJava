package supermarket.interfaces;

// >> TODO: 2019-12-05  某一个种类的商品，满多少减多少
// >> TODO: 2019-12-05  某一个种类的商品，第二件半价

/**
 * 超市的折扣策略
 */
public interface DiscountStrategy {
    double discount(ShoppingCart shoppingCart);
}
