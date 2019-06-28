package BehavioralDesignPatterns.NullObjectPattern;

/**
 * Created by adere on 28.06.2019.
 */
public class Main {

    public static void main(String[] args) {


        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Dincer").getName());

        System.out.println(customerFactory.getCustomer("sasdad").getName());
    }
}
