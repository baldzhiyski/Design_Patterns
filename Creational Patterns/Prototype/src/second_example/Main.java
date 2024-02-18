package second_example;

import second_example.shapes.Circle;
import second_example.shapes.Rectangle;
import second_example.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(20);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(15);
        rectangle.setHeight(20);
        rectangle.setColor("blue");
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects ");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": Identical");
                } else {
                    System.out.println(i + ": Not Identical");
                }
            } else {
                System.out.println(i + ": Shape objects are the same");
            }
        }
    }

}
