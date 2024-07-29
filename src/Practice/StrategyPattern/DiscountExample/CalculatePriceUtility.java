package Practice.StrategyPattern.DiscountExample;

public class CalculatePriceUtility {

    public static double calculateBillingAmount(double price, int discount) {
        double totalDiscount = (price / 100) * discount;
        System.out.println("Total discount is::" + totalDiscount + " INR.");
        return price - totalDiscount;
    }
}
