package BehavioralDesignPatterns.IteratorPattern;

/**
 * Created by adere on 25.06.2019.
 */
public class NameIterator implements Iterator {

    private String[] names;

    private int index;


    public NameIterator(String[] names) {
        this.names = names;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {

        if(hasNext())
            return names[index++];

        return null;
    }
}
