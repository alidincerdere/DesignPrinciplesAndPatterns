package StructuralDesignPatterns.Decorator;

/**
 * Created by adere on 2.07.2019.
 */
public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Milk ";
    }
}
