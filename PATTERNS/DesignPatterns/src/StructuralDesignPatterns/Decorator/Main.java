package StructuralDesignPatterns.Decorator;

/**
 * Created by adere on 2.07.2019.
 */
public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Milk( new Sugar( new Sugar( new PlainBeverage())));

        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
    }
}
