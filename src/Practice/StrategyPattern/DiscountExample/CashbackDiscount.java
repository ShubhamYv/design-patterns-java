package Practice.StrategyPattern.DiscountExample;

public class CashbackDiscount implements DiscountStrategy {
    @Override
    public int giveDiscount(int discountPercent) {
        System.out.println("Applied Cashback Discount of::" + discountPercent +"%");
        return discountPercent;
    }
}
