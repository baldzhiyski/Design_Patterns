package shape_example.invoker;

import shape_example.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class SketchBoard {
    List<Command> commandList;

    public SketchBoard() {
        this.commandList = new ArrayList<>();
    }

    public  void addCommand(Command command){
        commandList.add( command);
    }
    public void drawShape(){
        commandList.forEach(Command::execute);
    }
}
