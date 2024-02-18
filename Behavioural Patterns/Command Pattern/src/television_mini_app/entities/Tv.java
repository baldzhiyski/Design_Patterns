package television_mini_app.entities;

public class Tv  implements  Receiver{
    @Override
    public void switchOn() {
        System.out.println("Switch on TV");
    }
}
