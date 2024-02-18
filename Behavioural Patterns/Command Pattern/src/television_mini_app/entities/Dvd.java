package television_mini_app.entities;

public class Dvd implements  Receiver {
    @Override
    public void switchOn() {
        System.out.println("Switch on from DVDPlayer");
    }
}
