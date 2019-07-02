package StructuralDesignPatterns.Decorator;

/**
 * Created by adere on 2.07.2019.
 */
public class PlainBeverage implements Beverage{
    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return " Plain Beverage ";
    }
}
