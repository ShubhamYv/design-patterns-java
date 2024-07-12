package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class DriverClass {
    public static void main(String[] args) {
        WindowsFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        windowsButton.click();

        TextBox windowsTextBox = windowsFactory.createTextBox();
        windowsTextBox.write();

        CheckBox windowsCheckBox = windowsFactory.createCheckBox();
        windowsCheckBox.checkBoxButton();

        System.out.println("---------------------");

        MacFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        macButton.click();

        TextBox macTextBox = macFactory.createTextBox();
        macTextBox.write();

        CheckBox macCheckBox = macFactory.createCheckBox();
        macCheckBox.checkBoxButton();
    }
}
