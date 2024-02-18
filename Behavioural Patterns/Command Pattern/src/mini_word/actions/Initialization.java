package mini_word.actions;

import mini_word.commands.CommandImpl;
import mini_word.commands.CommandInterface;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text) {
        CommandInterface commandInterface = new CommandImpl(text);
        commandInterface.init();
        return commandInterface;

    }
}
