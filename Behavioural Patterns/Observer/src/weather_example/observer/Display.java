package weather_example.observer;

public class Display implements Observer{
    private double temperature;

    @Override
    public void update(double temperature) {
        this.temperature = temperature;
        System.out.println("Current Temperature " + temperature);
    }
}
