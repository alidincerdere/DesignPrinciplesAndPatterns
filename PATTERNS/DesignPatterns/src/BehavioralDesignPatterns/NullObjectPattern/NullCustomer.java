package BehavioralDesignPatterns.NullObjectPattern;

/**
 * Created by adere on 28.06.2019.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "No Customer exists with the given name";
    }
}
