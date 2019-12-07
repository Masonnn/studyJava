package supermarket;

import supermarket.interfaces.Customer;
import supermarket.interfaces.Shopman;

import static supermarket.util.ShoppingUtil.createCustomer;

class ShoppingTask {
    private Shopman shopman;

    public ShoppingTask(Shopman shopman) {
        this.shopman = shopman;
    }

    public void executeTask(){
        Customer customer = createCustomer(true);

        shopman.serveCustomer(customer);
    }
}
