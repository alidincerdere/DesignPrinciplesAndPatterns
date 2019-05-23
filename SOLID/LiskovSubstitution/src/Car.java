/**
 * Created by adere on 23.05.2019.
 */
public class Car implements NormalVehicle {
    @Override
    public void speed() {
        System.out.println("Car Speeds up");
    }

    @Override
    public void addFuel() {

        System.out.println("adding fuel to the car");
    }
}
