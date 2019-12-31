package by.bntu.fitr.povt.alexeyd.lab13.model.entity;

public class Bread extends Product {

    public static int bredAmount;
    private boolean organic;
    private String sort;
    private String flour;
    private String color;
    private String shape;

    /* static initialization block (it's called only once) */
    static {
        bredAmount = 0;
    }

    /* initialization block (it's called every time an object is created)*/
    {
        bredAmount++;
    }

    public Bread() {}

    /* copy -constructor (type of constructor with parameters)*/
    public Bread(Bread bread) {
        super(bread.isHelpChildren(), bread.getWeight(), bread.getPrice(), bread.getId());
        this.organic = bread.organic;
        this.sort = bread.sort;
        this.flour = bread.flour;
        this.color = bread.color;
        this.shape = bread.shape;
    }

    public Bread(boolean helpChildren, int weight, double price, boolean organic, String sort, String flour, String color, String shape, int id) {
        super(helpChildren, weight, price, id);
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
                 ", id=" + getId() + '\'' +
                '}';
    }
}
