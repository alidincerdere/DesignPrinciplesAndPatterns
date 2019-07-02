package StructuralDesignPatterns.Adaptor;

/**
 * Created by adere on 2.07.2019.
 */
public class Main {

    public static void main(String[] args) {


        Vehicle car = new Car();

        Vehicle bus = new Bus();

        Vehicle bicycleAdaptor = new BicycleAdaptor(new Bicycle());

        car.accelerate();
        bus.accelerate();
        bicycleAdaptor.accelerate();
    }
}
