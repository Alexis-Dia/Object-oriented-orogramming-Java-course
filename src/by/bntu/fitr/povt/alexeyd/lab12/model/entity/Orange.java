package by.bntu.fitr.povt.alexeyd.lab12.model.entity;

public class Orange extends Product {

    public static int orangeAmount;
    private double diameter;
    private double vitaminC;
    private boolean organic;
    private String sort;
    private String form;

    /* static initialization block (it's called only once) */
    static {
        orangeAmount = 0;
    }

    /* initialization block (it's called every time an object is created)*/
    {
        orangeAmount++;
    }

    public Orange() {}

    public Orange(boolean helpChildren, int weight, double price, double diameter, double vitaminC, boolean organic, String sort, String form, int id) {
        super(helpChildren, weight, price, id);
        this.diameter = diameter;
        this.vitaminC = vitaminC;
        this.organic = organic;
        this.sort = sort;
        this.form = form;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVitaminC() {
        return vitaminC;
    }

    public void setVitaminC(double vitaminC) {
        this.vitaminC = vitaminC;
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

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "diameter=" + diameter +
                ", vitaminC=" + vitaminC +
                ", organic=" + organic +
                ", sort='" + sort + '\'' +
                ", form='" + form + '\'' +
                '}';
    }
}
