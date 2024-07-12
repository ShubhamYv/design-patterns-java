package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class WindowsButton implements Button {

    @Override
    public void click() {
        System.out.println("Windows button clicked.");
    }
}
