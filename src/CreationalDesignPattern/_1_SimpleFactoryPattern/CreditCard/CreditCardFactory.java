package CreationalDesignPattern._1_SimpleFactoryPattern.CreditCard;

public class CreditCardFactory {

    public static CreditCard getCreditCardInstance(String cardName) {
        if (cardName.equalsIgnoreCase("Diamond")) {
            return new DiamondCreditCard();
        } else if (cardName.equalsIgnoreCase("Platinum")) {
            return new PlatinumCreditCard();
        } else {
            return null;
        }
    }
}

/*
 * In future if we want to add any new type of CreditCard, we need to change CreditCardFactory Class.
 * So here SOLID principle's 'O' which is open-closed principle violates.
 * Because we need to change the code and everytime we have to add if/ else-if condition.
 * */