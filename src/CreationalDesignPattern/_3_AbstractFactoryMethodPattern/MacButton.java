package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Mac button clicked.");
    }
}

