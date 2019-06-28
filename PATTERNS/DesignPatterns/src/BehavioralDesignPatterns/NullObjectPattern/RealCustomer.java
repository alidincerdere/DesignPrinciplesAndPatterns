package BehavioralDesignPatterns.NullObjectPattern;

/**
 * Created by adere on 28.06.2019.
 */
public class RealCustomer extends AbstractCustomer {


    private String customerName;

    public RealCustomer(String name) {
        customerName = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return customerName;
    }
}
