package by.bntu.fitr.povt.alexeyd.lab10.model.entity;

public class Bucket {

    public static final int DEFAULT_PRODUCT_AMOUNT = 3;
    public String name;
    public Product bread;
    public Product milk;
    public Product orange;

    /**
     * default constructor (constructor without parameters)
     */
    public Bucket() {
    }

    /**
     * constructor with parameters
     * @param name
     */
    public Bucket(String name) {
        this.name = name;
    }

    /**
     * constructor with parameters
     * @param name
     * @param bread
     * @param milk
     * @param orange
     */
    public Bucket(String name, Bread bread, Milk milk, Orange orange) {
        this.name = name;
        this.bread = bread;
        this.milk = milk;
        this.orange = orange;
}

    /**
     * copy-constructor
     * @param bucket
     */
    public Bucket(Bucket bucket) {
        this.name = bucket.name;
        this.bread = bucket.bread;
        this.milk = bucket.milk;
        this.orange = bucket.orange;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "name='" + name + '\'' +
                ", bread=" + bread +
                ", milk=" + milk +
                ", orange=" + orange +
                '}';
    }
}
