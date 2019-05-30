package by.bntu.fitr.povt.alexeyd.lab10.model.entity;

public class Orange extends Product{

    private double diametr;
    private double vitaminC;

    public Orange() {}

    public Orange(boolean helpChildren, int weight, double price, double diametr, double vitaminC) {
        super(helpChildren, weight, price);
        this.diametr = diametr;
        this.vitaminC = vitaminC;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "diametr=" + diametr +
                ", vitaminC=" + vitaminC +
                '}';
    }
}
