package CreationalDesignPattern._2_FactoryMethodPattern.CreditCardExample;

public class PlatinumCardFactory extends CreditCardFactory {
    @Override
    ICreditCard createCreditCard() {
        return new PlatinumCard();
    }
}
