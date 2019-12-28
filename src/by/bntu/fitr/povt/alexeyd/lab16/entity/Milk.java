package by.bntu.fitr.povt.alexeyd.lab16.entity;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class Milk extends Product implements Serializable {

    public static int milkAmount;
    private int volume;
    private double fat;
    private double carbons;
    private boolean processed;
    private boolean organic;

    /* static initialization block (it's called only once) */
    static {
        milkAmount = 0;
    }

    /* initialization block (it's called every time an object is created)*/
    {
        milkAmount++;
    }

    public Milk() {}

    public Milk(boolean helpChildren, int weight, double price, int volume, double fat, double carbons, boolean processed, boolean organic, int id) {
        super(helpChildren, weight, price, id);
        this.volume = volume;
        this.fat = fat;
        this.carbons = carbons;
        this.processed = processed;
        this.organic = organic;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbons() {
        return carbons;
    }

    public void setCarbons(double carbons) {
        this.carbons = carbons;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume=" + volume +
                ", fat=" + fat +
                ", carbons=" + carbons +
                ", processed=" + processed +
                ", organic=" + organic +
                ", helpChildren=" + isHelpChildren() + '\'' +
                ", weight=" + getWeight() + '\'' +
                ", price=" + getPrice() + '\'' +
                ", id=" + getId() + '\'' +
                '}';
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    private void readObjectNoData() throws ObjectStreamException {

    }
}
