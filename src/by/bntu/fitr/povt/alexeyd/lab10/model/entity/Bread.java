package by.bntu.fitr.povt.alexeyd.lab10.model.entity;

public class Bread extends Product{

    private boolean organic;
    private String sort;
    private String flour;
    private String color;
    private String shape;

    public Bread() {}

    public Bread(boolean helpChildren, int weight, double price, boolean organic, String sort, String flour, String color, String shape) {
        super(helpChildren, weight, price);
        this.organic = organic;
        this.sort = sort;
        this.flour = flour;
        this.color = color;
        this.shape = shape;
    }

    public boolean isOrganic() {
        return organic;
    }

    public void setOrganic(boolean organic) {
        this.organic = organic;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "organic=" + organic +
                ", sort='" + sort + '\'' +
                ", flour='" + flour + '\'' +
                ", color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
}
