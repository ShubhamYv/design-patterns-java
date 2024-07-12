package CreationalDesignPattern._1_SimpleFactoryPattern.CreditCard;

public class DiamondCreditCard implements CreditCard {
    @Override
    public String getCardType() {
        return "Diamond Credit Card";
    }

    @Override
    public double getAnnualFee() {
        return 1000;
    }

    @Override
    public double getCardLimit() {
        return 10000000;
    }
}
