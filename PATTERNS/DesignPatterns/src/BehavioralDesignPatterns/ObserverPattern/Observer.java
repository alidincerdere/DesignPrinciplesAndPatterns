package BehavioralDesignPatterns.ObserverPattern;

/**
 * Created by adere on 21.06.2019.
 */
public interface Observer {

    void update(int pressure, int temperature, int humidity);
}
