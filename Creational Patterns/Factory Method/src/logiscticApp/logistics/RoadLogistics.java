package logiscticApp.logistics;

import logiscticApp.transport.Truck;

public class RoadLogistics implements  Logistic{

    @Override
    public void planDelivery() {
        new Truck("Plovdiv","Varna-Burgas-Plovdiv").deliver();
    }
}
