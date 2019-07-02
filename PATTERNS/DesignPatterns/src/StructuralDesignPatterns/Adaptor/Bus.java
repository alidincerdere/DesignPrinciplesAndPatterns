package StructuralDesignPatterns.Adaptor;

/**
 * Created by adere on 2.07.2019.
 */
public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating");
    }
}
