package shapes_example.shapes;

public class BaseShape implements Shape{
    private int x;
    private  int y;

    public BaseShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return  x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }
}
