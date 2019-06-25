package BehavioralDesignPatterns.IteratorPattern;

/**
 * Created by adere on 25.06.2019.
 */
public class NameRepository {

    private String[] names = {"Dincer", "Zeynep", "Selma", "Tuncer", "Zeliha"};

    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
