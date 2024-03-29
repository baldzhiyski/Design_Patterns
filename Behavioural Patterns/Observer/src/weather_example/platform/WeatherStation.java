package weather_example.platform;

import weather_example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements  Subject {
    private double temperature;
    private List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
    @Override
    public  void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public  void notifyObservers(){
        observers.forEach(obs -> obs.update(temperature));
    }

}
