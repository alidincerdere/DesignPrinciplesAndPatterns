/**
 * Created by adere on 23.05.2019.
 */
public class ElectricCar implements ElectricVehicle {
    @Override
    public void speed() {
        System.out.println("Electric car speeds up");
    }

    @Override
    public void chargeBattery() {

        System.out.println("battery is being charged");
    }

    //you should not implement any methods in the interface which class would not use.

}
