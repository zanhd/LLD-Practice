import Component.Product;
import Component.Watch;
import Decorators.NoCoupon;
import Decorators.NormalDiscountCoupon;
import Decorators.SaleDiscountCoupon;

public class Main {
    public static void main(String[] args) {
        Product productAfterDiscounts = new SaleDiscountCoupon(new NormalDiscountCoupon(new NoCoupon(new Watch(100))));

        System.out.println("Final Cost [After Discount] : " + productAfterDiscounts.cost() + "$");
    }
}
