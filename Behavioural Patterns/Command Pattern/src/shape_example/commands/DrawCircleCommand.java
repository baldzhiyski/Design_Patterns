package shape_example.commands;

import shape_example.reciever.Shape;

public class DrawCircleCommand implements  Command{
    private Shape shape;

    public DrawCircleCommand(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        shape.drawCircle();
    }
}
