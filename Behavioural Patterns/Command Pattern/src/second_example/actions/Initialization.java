package second_example.actions;

import second_example.commands.CommandImpl;
import second_example.commands.CommandInterface;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface commandInterface = new CommandImpl(text);
        commandInterface.init();
        return commandInterface;

    }
}
