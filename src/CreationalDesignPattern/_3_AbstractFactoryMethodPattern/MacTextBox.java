package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class MacTextBox implements TextBox{
    @Override
    public void write() {
        System.out.println("Writing in Mac TextBox.");
    }
}
