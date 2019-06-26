package BehavioralDesignPatterns.Template;

/**
 * Created by adere on 26.06.2019.
 */
public abstract class Algorithm {

    public abstract void initialize();

    public abstract void sorting();

    public abstract void printResult();

    public void sort() {

        initialize();
        sorting();
        printResult();
    }
}
