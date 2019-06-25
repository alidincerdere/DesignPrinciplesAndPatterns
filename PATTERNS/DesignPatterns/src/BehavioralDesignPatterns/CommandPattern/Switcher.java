package BehavioralDesignPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adere on 25.06.2019.
 */

//invoker
public class Switcher {

    List<Command> commandList;

    public Switcher() {
        commandList = new ArrayList<>();
    }

    public void executeCommands() {
        commandList.stream().forEach(c -> c.execute());
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }
}
