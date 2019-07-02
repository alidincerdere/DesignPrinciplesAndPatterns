package StructuralDesignPatterns.Decorator;

/**
 * Created by adere on 2.07.2019.
 */
public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Sugar ";
    }
}
