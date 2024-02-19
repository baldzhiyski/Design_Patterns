package television_mini_app;

import television_mini_app.commands.Command;
import television_mini_app.commands.OnCommand;
import television_mini_app.resievers.Dvd;
import television_mini_app.resievers.Receiver;
import television_mini_app.resievers.Tv;
import television_mini_app.invoker.Invoker;

public class Main {
    public static void main(String[] args) {

        // On command for TV with same invoker
        Receiver receiver = new Tv();
        Command onCommand = new OnCommand(receiver);

        Invoker invoker = new Invoker(onCommand);
        invoker.execute();

        // On command for DVDPlayer with same invoker
        receiver = new Dvd();
        onCommand = new OnCommand(receiver);

        invoker = new Invoker(onCommand);
        invoker.execute();
    }
}
