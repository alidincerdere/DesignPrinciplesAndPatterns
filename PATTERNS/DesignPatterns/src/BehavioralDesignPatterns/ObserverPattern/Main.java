package BehavioralDesignPatterns.ObserverPattern;

/**
 * Created by adere on 21.06.2019.
 */
public class Main {


    public static void main(String[] args) {
        WhetherStation whetherStation = new WhetherStation();

        WhetherObserver whetherObserver = new WhetherObserver(whetherStation);

        whetherStation.setHumidity(100);
        whetherStation.setPressure(200);
        whetherStation.setTemperature(300);
    }



}
