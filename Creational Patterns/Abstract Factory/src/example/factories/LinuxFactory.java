package example.factories;

import example.buttons.LinuxButton;
import example.checkBoxes.LinuxCheckBox;

public class LinuxFactory implements  GUIFactory{
    @Override
    public void createButton() {
        new LinuxButton().paint();
    }

    @Override
    public void createCheckBox() {
       new LinuxCheckBox().paint();
    }
}
