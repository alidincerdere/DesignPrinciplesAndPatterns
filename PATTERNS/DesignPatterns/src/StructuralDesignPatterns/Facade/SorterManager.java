package StructuralDesignPatterns.Facade;

/**
 * Created by adere on 2.07.2019.
 */
public class SorterManager {

    private Algoritm bubleSorter;
    private Algoritm mergeSorter;
    private Algoritm quickSorter;

    public SorterManager() {

        bubleSorter = new BubbleSort();
        mergeSorter = new MergeSort();
        quickSorter = new QuickSort();
    }

    public void doMergeSort() {

        mergeSorter.sort();
    }

    public void doBubbleSort() {

        bubleSorter.sort();
    }

    public void doQuickSort() {

        quickSorter.sort();
    }
}
