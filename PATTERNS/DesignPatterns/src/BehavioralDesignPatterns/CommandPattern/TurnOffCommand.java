package BehavioralDesignPatterns.CommandPattern;

/**
 * Created by adere on 25.06.2019.
 */


public class TurnOffCommand implements Command {

    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
