package BehavioralDesignPatterns.VisitorPattern;

/**
 * Created by adere on 28.06.2019.
 */
public abstract class ShoppingItem {

    private String type;

    private double price;

    public ShoppingItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
