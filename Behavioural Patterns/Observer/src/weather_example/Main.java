package weather_example;

import weather_example.observer.Display;
import weather_example.platform.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display();
        Display display2 = new Display();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Simulate temperature change
        weatherStation.setTemperature(25.5);
        weatherStation.setTemperature(30.0);

        // Stop displaying for display2
        weatherStation.removeObserver(display2);

        // Simulate temperature change again
        weatherStation.setTemperature(28.0);
    }
}
