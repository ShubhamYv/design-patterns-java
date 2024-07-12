package CreationalDesignPattern._2_FactoryMethodPattern.CreditCardExample;

public abstract class CreditCardFactory {

    abstract ICreditCard createCreditCard();

    ICreditCard getCreditCard() {
        return createCreditCard();
    }
}
