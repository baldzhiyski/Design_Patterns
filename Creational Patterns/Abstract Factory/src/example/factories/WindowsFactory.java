package example.factories;

import example.buttons.WindowsButton;
import example.checkBoxes.WindowsCheckBox;

public class WindowsFactory implements GUIFactory{
    @Override
    public void createButton() {
        new WindowsButton().paint();
    }

    @Override
    public void createCheckBox() {
        new WindowsCheckBox().paint();
    }
}
