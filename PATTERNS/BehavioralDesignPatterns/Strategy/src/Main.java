public class Main {

    public static void main(String[] args) {

        Strategy manager = new Manager(new Multiply());

        manager.operation(5, 3);

    }
}
