package shape_example.commands;

import shape_example.reciever.Shape;

public class DrawRectangleCommand  implements  Command{
   private Shape shape;

    public DrawRectangleCommand(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void execute() {
        shape.drawRectangle();
    }
}
