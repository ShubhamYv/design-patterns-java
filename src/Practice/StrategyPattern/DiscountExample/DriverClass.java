package Practice.StrategyPattern.DiscountExample;

public class DriverClass {
    public static void main(String[] args) {
        ApplyDiscount applyDiscount = new ApplyDiscount(new CashbackDiscount());

        double totalBill = 3000;
        int discount = applyDiscount.discountStrategy.giveDiscount(10);
        double billingAmount = CalculatePriceUtility.calculateBillingAmount(totalBill, discount);
        System.out.println("Final bill::" + billingAmount);
    }
}
