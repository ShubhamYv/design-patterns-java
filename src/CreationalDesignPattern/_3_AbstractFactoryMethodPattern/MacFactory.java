package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public class MacFactory implements GUI_Factory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MacTextBox();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
