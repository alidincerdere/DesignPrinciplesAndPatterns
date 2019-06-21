package BehavioralDesignPatterns.ObserverPattern;

/**
 * Created by adere on 21.06.2019.
 */
public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyAllObservers();
}
