package cake_project;

public class BiscuitCake extends Cake {
    public BiscuitCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Biscuit cake");
    }

    @Override
    public void bake() {
        System.out.println("Bake ate 180 degrees");
    }

    @Override
    public void box() {
        System.out.println("Biscuit Cake Box");
    }
}
