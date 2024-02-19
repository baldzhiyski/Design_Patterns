package shape_example.reciever;

public class Shape {
    public void drawCircle() {
        System.out.println("Drawing Circle..");
    }

    public void drawSquare() {
        System.out.println("Drawing Square..");
    }

    public void drawRectangle() {
        System.out.println("Drawing Rectangle..");
    }

    public void eraseShape(String shape) {
        System.out.println("Erasing " + shape);
    }
}
