package BehavioralDesignPatterns.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adere on 28.06.2019.
 */
public class Main {

    public static void main(String[] args) {

        List<ShoppingItem> shoppingItemList = new ArrayList();

        ShoppingItem table = new Table("desc", 30);
        ShoppingItem chair = new Chair( "chair1", 20);
        ShoppingItem chair2 = new Chair( "chair2", 40);

        shoppingItemList.add(table);
        shoppingItemList.add(chair);
        shoppingItemList.add(chair2);

        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCart();

        double sum = 0;

        for(ShoppingItem shoppingItem : shoppingItemList)
            sum += shoppingItem.accept(shoppingCartVisitor);


        System.out.println(sum);
    }
}
