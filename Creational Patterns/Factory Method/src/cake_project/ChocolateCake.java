package cake_project;

public class ChocolateCake extends Cake{
    public ChocolateCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Chocolate cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking at 190 degrees");
    }

    @Override
    public void box() {
        System.out.println("Chocolate Box cake");
    }
}
