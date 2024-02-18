package example.builders;

import example.cars.CarType;
import example.cars.ManualCar;
import example.components.Engine;
import example.components.GPSNavigator;
import example.components.Transmission;
import example.components.TripComputer;

public class ManualBuilder implements  Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public ManualCar getResult() {
        return new ManualCar(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
