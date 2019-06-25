package BehavioralDesignPatterns.CommandPattern;

/**
 * Created by adere on 25.06.2019.
 */
//receiver
public class Light {

    public void turnOn() {

        System.out.println("lights are ON");
    }

    public void turnOff() {

        System.out.println("Lights are OFF");
    }
}
