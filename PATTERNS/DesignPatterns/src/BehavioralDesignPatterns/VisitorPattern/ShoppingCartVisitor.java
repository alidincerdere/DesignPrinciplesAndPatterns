package BehavioralDesignPatterns.VisitorPattern;

/**
 * Created by adere on 28.06.2019.
 */
public interface ShoppingCartVisitor {

    double visit(ShoppingItem shoppingItem);
}
