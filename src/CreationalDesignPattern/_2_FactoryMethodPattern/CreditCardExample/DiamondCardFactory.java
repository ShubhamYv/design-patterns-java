package CreationalDesignPattern._2_FactoryMethodPattern.CreditCardExample;

public class DiamondCardFactory extends CreditCardFactory {
    @Override
    ICreditCard createCreditCard() {
        return new DiamondCard();
    }
}
