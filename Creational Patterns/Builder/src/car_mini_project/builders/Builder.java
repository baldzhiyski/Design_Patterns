package car_mini_project.builders;

import car_mini_project.cars.CarType;
import car_mini_project.components.Engine;
import car_mini_project.components.GPSNavigator;
import car_mini_project.components.Transmission;
import car_mini_project.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
