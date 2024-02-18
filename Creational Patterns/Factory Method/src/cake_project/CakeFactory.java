package cake_project;

public class CakeFactory {

    private CakeFactory(){

    }
    public static Cake  createCake(String type,double diameter, double price, int pieces) {
        return switch (type) {
            case "Biscuit" -> new BiscuitCake(diameter, price, pieces);
            case "Chocolate" -> new ChocolateCake(diameter, price, pieces);
            case "Spinach" -> new SpinachCake(diameter, price, pieces);
            default -> throw new IllegalArgumentException();
        };
    }
}
