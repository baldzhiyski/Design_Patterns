package logiscticApp.transport;

public class Truck implements Transport{
    private String addressToDeliver;
    private String route;

    public Truck(String addressToDeliver, String route) {
        this.addressToDeliver = addressToDeliver;
        this.route = route;
    }

    @Override
    public void deliver() {
        System.out.printf("The packet was delivered to %s and the taken route was %s.\n",addressToDeliver,route);
    }
}
