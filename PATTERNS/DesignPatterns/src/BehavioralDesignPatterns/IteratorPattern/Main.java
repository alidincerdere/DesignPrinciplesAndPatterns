package BehavioralDesignPatterns.IteratorPattern;

/**
 * Created by adere on 25.06.2019.
 */
public class Main {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while(iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
