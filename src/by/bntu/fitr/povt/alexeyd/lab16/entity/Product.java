package by.bntu.fitr.povt.alexeyd.lab16.entity;

import java.io.*;

public class Product implements Comparable<Product>, Serializable {

    public static int productAmount;
    private boolean helpChildren;
    private int weight;
    private double price;
    private int id;

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    private void readObjectNoData() throws ObjectStreamException {

    }

    /* static initialization block (it's called only once) */
    static {
        productAmount = 0;
    }

    /* initialization block (it's called every time an object is created)*/ {
        productAmount++;
    }

    public Product() {
    }

    public Product(boolean helpChildren, int weight, double price, int id) {
        this.helpChildren = helpChildren;
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public static void increaseCount() {
        productAmount--;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
            "helpChildren=" + helpChildren +
            ", weight=" + weight +
            ", price=" + price +
            ", id=" + id +
            '}';
    }

    @Override
    public int compareTo(Product o) {
        return Double.valueOf(this.getPrice()).compareTo(Double.valueOf(o.getPrice()));
    }

}