package Decorators;

import Component.Product;

public class SaleDiscountCoupon extends CouponDecorator {
    Product product;

    public SaleDiscountCoupon(Product product) {
        this.product= product;
    }

    @Override
    public double cost() {
        return this.product.cost() * 0.5; // Flat 50% discount
    }
}
