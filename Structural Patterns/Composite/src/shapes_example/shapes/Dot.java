package shapes_example.shapes;

public class Dot extends BaseShape{
    private static final int DOT_SIZE = 5;
    public Dot(int x, int y) {
        super(x, y);
    }

    @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }
}
