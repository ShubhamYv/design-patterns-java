package CreationalDesignPattern._2_FactoryMethodPattern.CreditCardExample;

public class PlatinumCard implements ICreditCard {
    @Override
    public String getCardType() {
        return "Platinum Credit Card";
    }

    @Override
    public double getAnnualFee() {
        return 1000;
    }

    @Override
    public double getCardLimit() {
        return 7500000;
    }
}
