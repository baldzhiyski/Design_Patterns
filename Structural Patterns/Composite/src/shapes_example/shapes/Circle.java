package shapes_example.shapes;

public class Circle extends BaseShape{
    private int radius;
    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius =radius;
    }

    @Override
    public int getWidth() {
        return radius*2;
    }

    @Override
    public int getHeight() {
        return radius*2;
    }
}
