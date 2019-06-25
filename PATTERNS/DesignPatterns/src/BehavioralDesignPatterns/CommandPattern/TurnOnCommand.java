package BehavioralDesignPatterns.CommandPattern;

/**
 * Created by adere on 25.06.2019.
 */
public class TurnOnCommand implements Command{

    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
