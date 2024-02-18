package cake_project;

public class SpinachCake extends  Cake{
    public SpinachCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Spinach cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking at 250 degrees");
    }

    @Override
    public void box() {
        System.out.println("Green Box for this cake");
    }
}
