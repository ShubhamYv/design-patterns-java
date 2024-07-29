package Practice.StrategyPattern.DiscountExample;

public class CouponDiscount implements DiscountStrategy {
    @Override
    public int giveDiscount(int discountPercent) {
        System.out.println("Applied Coupon Discount of::" + discountPercent + "%");
        return discountPercent;
    }
}
