package StructuralDesignPatterns.Adaptor;

/**
 * Created by adere on 2.07.2019.
 */
public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
}
