package by.bntu.fitr.povt.alexeyd.lab10.model.entity;

public class Product {

    private boolean helpChildren;
    private int weight;
    private double price;

    public Product() {}

    public Product(boolean helpChildren, int weight, double price) {
        this.helpChildren = helpChildren;
        this.weight = weight;
        this.price = price;
    }

    public boolean isHelpChildren() {
        return helpChildren;
    }

    protected void setHelpChildren(boolean helpChildren) {
        this.helpChildren = helpChildren;
    }

    public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }
}
