package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void checkBoxButton() {
        System.out.println("Windows checkBox is checked.");
    }
}
