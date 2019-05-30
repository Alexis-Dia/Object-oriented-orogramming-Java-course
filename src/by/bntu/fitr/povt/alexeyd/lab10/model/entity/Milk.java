package by.bntu.fitr.povt.alexeyd.lab10.model.entity;

public class Milk extends Product{

    private int volume;
    private double fat;

    public Milk() {}

    public Milk(boolean helpChildren, int weight, double price, int volume, double fat) {
        super(helpChildren, weight, price);
        this.volume = volume;
        this.fat = fat;
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

    @Override
    public String toString() {
        return "Milk{" +
                "volume=" + volume +
                ", fat=" + fat +
                '}';
    }
}
