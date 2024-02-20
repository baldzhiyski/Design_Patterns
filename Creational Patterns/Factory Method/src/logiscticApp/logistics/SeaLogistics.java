package logiscticApp.logistics;

import logiscticApp.transport.Ship;

public class SeaLogistics implements Logistic{
    @Override
    public void planDelivery() {
        new Ship("London","North Atlantic Ocean").deliver();
    }
}
