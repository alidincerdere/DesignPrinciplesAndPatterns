package BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adere on 21.06.2019.
 */
public class WhetherStation implements Subject {

    private int pressure;
    private int temperature;
    private int humidity;

    private List<Observer> observers;


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {

        observers.forEach(o -> o.update(pressure,temperature, humidity));
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }

    public WhetherStation() {
        observers = new ArrayList<>();
    }
}
