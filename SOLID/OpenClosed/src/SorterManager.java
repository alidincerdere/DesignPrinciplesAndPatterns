/**
 * Created by adere on 16.05.2019.
 */
public class SorterManager {

    public void sort(Sorter sorter) {

        if(sorter.type == SortTypes.MERGESORT)
            doMergeSort(sorter);
        else if(sorter.type == SortTypes.INSERTIONSORT)
            doInsertionSort(sorter);
    }

    private void doInsertionSort(Sorter sorter) {

        sorter.sort();
    }

    private void doMergeSort(Sorter sorter) {
        sorter.sort();
    }
}
