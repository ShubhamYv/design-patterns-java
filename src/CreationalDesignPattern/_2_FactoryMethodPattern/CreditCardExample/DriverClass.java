package CreationalDesignPattern._2_FactoryMethodPattern.CreditCardExample;

public class DriverClass {
    public static void main(String[] args) {

        CreditCardFactory platinumFactory = new PlatinumCardFactory();
        ICreditCard platinumCard = platinumFactory.getCreditCard();

        System.out.println("Card Type: " + platinumCard.getCardType());
        System.out.println("Annual Fee: " + platinumCard.getAnnualFee());
        System.out.println("Card Limit: " + platinumCard.getCardLimit());
        System.out.println("-----------------");

        CreditCardFactory diamondFactory = new DiamondCardFactory();
        ICreditCard diamondCard = diamondFactory.getCreditCard();

        System.out.println("Card Type: " + diamondCard.getCardType());
        System.out.println("Annual Fee: " + diamondCard.getAnnualFee());
        System.out.println("Card Limit: " + diamondCard.getCardLimit());
    }
}