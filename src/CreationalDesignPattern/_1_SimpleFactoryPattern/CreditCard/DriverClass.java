package CreationalDesignPattern._1_SimpleFactoryPattern.CreditCard;

public class DriverClass {

    public static void main(String[] args) {
        String input = "Platinum";
        CreditCard creditCard = CreditCardFactory.getCreditCardInstance(input);
        if (creditCard != null) {
            System.out.println(creditCard.getCardType());
            System.out.println(creditCard.getAnnualFee());
            System.out.println(creditCard.getCardLimit());
            System.out.println("--------------------");
        }
        String input2 = "Diamond";
        CreditCard creditCard2 = CreditCardFactory.getCreditCardInstance(input2);
        if (creditCard2 != null) {
            System.out.println(creditCard2.getCardType());
            System.out.println(creditCard2.getAnnualFee());
            System.out.println(creditCard2.getCardLimit());
            System.out.println("--------------------");
        }
    }
}
