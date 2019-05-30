package by.bntu.fitr.povt.alexeyd.lab10.model.entity;

public class Bread extends Product{

    private String sort;
    private String flour;

    public Bread() {}

    public Bread(boolean helpChildren, int weight, double price, String sort, String flour) {
        super(helpChildren, weight, price);
        this.sort = sort;
        this.flour = flour;
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

    @Override
    public String toString() {
        return "Bread{" +
                "sort='" + sort + '\'' +
                ", flour='" + flour + '\'' +
                '}';
    }
}
