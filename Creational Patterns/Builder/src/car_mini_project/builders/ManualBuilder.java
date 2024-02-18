package car_mini_project.builders;

import car_mini_project.cars.CarType;
import car_mini_project.cars.ManualCar;
import car_mini_project.components.Engine;
import car_mini_project.components.GPSNavigator;
import car_mini_project.components.Transmission;
import car_mini_project.components.TripComputer;

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
