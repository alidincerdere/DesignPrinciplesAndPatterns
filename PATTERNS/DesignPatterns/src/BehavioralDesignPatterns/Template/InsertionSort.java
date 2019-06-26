package BehavioralDesignPatterns.Template;

/**
 * Created by adere on 26.06.2019.
 */
public class InsertionSort extends Algorithm {
    private int[] numbers;

    public InsertionSort(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void initialize() {
        System.out.println("Initializing insertion sort");
    }

    @Override
    public void sorting() {

        System.out.println("Insertion sorting...");
    }

    @Override
    public void printResult() {

        for(int i=0; i< numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
    }
}
