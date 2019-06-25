package BehavioralDesignPatterns.CommandPattern;

/**
 * Created by adere on 25.06.2019.
 */
public class Main {

    public static void main(String[] args) {
        

        Switcher switcher = new Switcher();

        Light light = new Light();

        Command turnOnCommand = new TurnOnCommand(light);

        Command turnOffCommand = new TurnOffCommand(light);

        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);

        switcher.executeCommands();
    }
}
