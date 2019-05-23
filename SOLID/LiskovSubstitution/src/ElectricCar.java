/**
 * Created by adere on 23.05.2019.
 */
public class ElectricCar implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Electric car speeds up");
    }

    @Override
    public void addFuel() {

        throw new RuntimeException();
    }
}
