package CreationalDesignPattern._2_FactoryMethodPattern.CreditCardExample;

public class DiamondCard implements ICreditCard {
    @Override
    public String getCardType() {
        return "Diamond Credit Card";
    }

    @Override
    public double getAnnualFee() {
        return 500;
    }

    @Override
    public double getCardLimit() {
        return 500000;
    }
}
