package television_mini_app.invoker;

import television_mini_app.commands.Command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void execute(){
        this.command.execute();
    }
}
