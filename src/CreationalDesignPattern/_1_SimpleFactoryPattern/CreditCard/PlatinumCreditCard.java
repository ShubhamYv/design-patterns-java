package CreationalDesignPattern._1_SimpleFactoryPattern.CreditCard;

public class PlatinumCreditCard implements CreditCard {
    @Override
    public String getCardType() {
        return "Platinum Credit Card";
    }

    @Override
    public double getAnnualFee() {
        return 500;
    }

    @Override
    public double getCardLimit() {
        return 5000000;
    }
}
