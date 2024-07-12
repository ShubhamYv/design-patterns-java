package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class WindowsTextBox implements TextBox {
    @Override
    public void write() {
        System.out.println("Writing in Windows TextBox.");
    }
}
