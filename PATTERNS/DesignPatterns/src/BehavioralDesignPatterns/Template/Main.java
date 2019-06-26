package BehavioralDesignPatterns.Template;

/**
 * Created by adere on 26.06.2019.
 */
public class Main {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        Algorithm algorithm = new BubbleSort(numbers);
        algorithm.sort();

        algorithm = new InsertionSort(numbers);
        algorithm.sort();

    }
}
