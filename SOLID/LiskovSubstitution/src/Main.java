public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Vehicle car = new ElectricCar();

        if(car instanceof ElectricCar) {
            System.out.println("You can't add fuel to electric car");
        } else {
            car.addFuel();
        }
    }
}
