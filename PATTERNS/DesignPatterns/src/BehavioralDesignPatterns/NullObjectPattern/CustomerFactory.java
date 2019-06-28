package BehavioralDesignPatterns.NullObjectPattern;

/**
 * Created by adere on 28.06.2019.
 */
public class CustomerFactory {

    private Database database;

    public CustomerFactory() {
        database = new Database();
    }

    public AbstractCustomer getCustomer(String s) {

        if (doesCustomerExist(s))
            return new RealCustomer(s);
        return new NullCustomer();

    }

    public boolean doesCustomerExist(String s) {
        return database.customerExists(s);
    }
}
