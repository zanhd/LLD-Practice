package Decorators;

import Component.Product;

public class NoCoupon extends CouponDecorator {
    Product product;

    public NoCoupon(Product product) {
        this.product = product;
    }

    @Override
    public double cost() {
        return this.product.cost(); //Flat 0% discount
    }
}
