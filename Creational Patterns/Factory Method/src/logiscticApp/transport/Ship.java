package logiscticApp.transport;

public class Ship implements Transport{
    private String addressToDeliver;
    private  String crossedOceans;

    public Ship(String addressToDeliver, String crossedOceans) {
        this.addressToDeliver = addressToDeliver;
        this.crossedOceans = crossedOceans;
    }

    @Override
    public void deliver() {
        System.out.printf("The packet was deliverd to %s , crossing the %s ocean\n",addressToDeliver,crossedOceans);
    }
}
