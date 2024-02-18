package example.builders;

import example.cars.CarType;
import example.components.Engine;
import example.components.GPSNavigator;
import example.components.Transmission;
import example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
