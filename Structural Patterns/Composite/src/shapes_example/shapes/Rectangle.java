package shapes_example.shapes;

public class Rectangle extends BaseShape{
    private int width;
    private int height;
    public Rectangle(int x, int y,int width , int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
