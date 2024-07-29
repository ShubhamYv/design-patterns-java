package Practice.StrategyPattern.DiscountExample;

public class FlatDiscount implements DiscountStrategy {
    @Override
    public int giveDiscount(int discountPercent) {
        System.out.println("Applied Flat Discount of::" + discountPercent + "%");
        return discountPercent;
    }
}
