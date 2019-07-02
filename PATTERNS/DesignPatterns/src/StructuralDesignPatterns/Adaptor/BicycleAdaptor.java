package StructuralDesignPatterns.Adaptor;

/**
 * Created by adere on 2.07.2019.
 */
public class BicycleAdaptor implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdaptor(Bicycle bicycle) {
        this.bicycle = bicycle;
    }


    @Override
    public void accelerate() {
        bicycle.go();
    }
}
