/*
    The open-closed desing principle states that the design and writing of the code should be done in a way that
    new functionality should be added with minimum changes in the existing code
    WE MUST KEEP AS MUCH EXISTING CODE AS UNCHANGED AS POSSIBLE

    software entities should be open for extension but closed for modification


    A class should not extend other class explicitly but we have to use common interfaces

    closely related patterns:
    - strategy pattern
    - template pattern


 */

public class Main {

    public static void main(String[] args) {

        SorterManager sorterManager = new SorterManager();
        sorterManager.sort(new QuickSort());
    }
}
