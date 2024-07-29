package Practice.StrategyPattern.DiscountExample;

public class ApplyDiscount {
    int customerId;
    DiscountStrategy discountStrategy;

    public ApplyDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
