package CreationalDesignPatterns.Builder;

/**
 * Created by adere on 1.07.2019.
 */
public class Main {

    public static void main (String[] args) {

        Person person = new Person.Builder("Ali", "adere@gmail.com").setAge(34).build();

        System.out.println(person);
    }
}
