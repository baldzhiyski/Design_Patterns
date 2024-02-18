package television_mini_app.commands;

import television_mini_app.entities.Receiver;

public class OnCommand implements Command{
    private Receiver receiver;

    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.switchOn();
    }
}
