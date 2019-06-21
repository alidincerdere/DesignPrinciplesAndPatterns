package BehavioralDesignPatterns.ObserverPattern;

/**
 * Created by adere on 21.06.2019.
 */
public class WhetherObserver implements Observer {

    private int pressure;

    private int temperature;

    private int humidiy;

    private Subject subject;

    @Override
    public void update(int pressure, int temperature, int humidity) {

        this.pressure = pressure;
        this.temperature = temperature;
        this.humidiy = humidity;

        printData();
    }

    private void printData() {

        System.out.println("Pressure: " + pressure + " Temperature: " + temperature + " Humidiy " + humidiy);
    }

    public WhetherObserver(Subject subject) {

        this.subject = subject;

        subject.addObserver(this);
    }
}
