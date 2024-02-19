package shape_example;

import shape_example.commands.Command;
import shape_example.commands.DrawCircleCommand;
import shape_example.commands.DrawRectangleCommand;
import shape_example.invoker.SketchBoard;
import shape_example.reciever.Shape;

public class Main {
    public static void main(String[] args) {

        SketchBoard sketchBoard = new SketchBoard();  //Invoker

        Shape drawShape = new Shape();  //Create a drawshape object this will be the receiver of the request
        Command drawCircle = new DrawCircleCommand(drawShape);  //Creating Command object and passing receiver
        Command drawRectangle = new DrawRectangleCommand(drawShape);
        sketchBoard.addCommand(drawCircle);
        sketchBoard.addCommand(drawRectangle);

        sketchBoard.drawShape();
    }

}

