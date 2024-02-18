package car_mini_project;

import car_mini_project.builders.ManualBuilder;
import car_mini_project.builders.CarBuilder;
import car_mini_project.cars.Car;
import car_mini_project.cars.ManualCar;
import car_mini_project.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete example.builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructSportsCar(manualBuilder);
        ManualCar carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}