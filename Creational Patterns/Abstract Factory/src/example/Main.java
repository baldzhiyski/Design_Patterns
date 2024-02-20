package example;

import example.factories.GUIFactory;
import example.factories.LinuxFactory;
import example.factories.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new WindowsFactory();
        }
        factory.createButton();
        factory.createCheckBox();
    }
}
