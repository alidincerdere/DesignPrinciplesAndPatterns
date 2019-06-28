package BehavioralDesignPatterns.VisitorPattern;

/**
 * Created by adere on 28.06.2019.
 */
public class ShoppingCart implements ShoppingCartVisitor {

    @Override
    public double visit(ShoppingItem shoppingItem) {
        return shoppingItem.getPrice();
    }
}
