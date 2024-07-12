package CreationalDesignPattern._3_AbstractFactoryMethodPattern;

public interface GUI_Factory {
    Button createButton();

    TextBox createTextBox();

    CheckBox createCheckBox();
}
