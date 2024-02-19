package television_mini_app.resievers;

public class Tv  implements  Receiver{
    @Override
    public void switchOn() {
        System.out.println("Switch on TV");
    }
}
