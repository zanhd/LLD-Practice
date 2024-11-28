package Decorators;

import Component.Product;

public class NormalDiscountCoupon extends CouponDecorator {
    Product product;

    public NormalDiscountCoupon(Product product) {
        this.product = product;
    }

    @Override
    public double cost() {
        return this.product.cost() * 0.9; //Flat 10% discount
    }
}
