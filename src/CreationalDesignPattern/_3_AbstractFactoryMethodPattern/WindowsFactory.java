package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class WindowsFactory implements GUI_Factory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
