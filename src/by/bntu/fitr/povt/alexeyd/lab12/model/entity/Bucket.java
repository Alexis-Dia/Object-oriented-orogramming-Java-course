package by.bntu.fitr.povt.alexeyd.lab12.model.entity;

public class Bucket {

    private static final int DEFAULT_SIZE = 10;

    private Product[] container;
    private String name;

    {
        container = new Product[DEFAULT_SIZE];
    }

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
     * Here we can use container another type. For example, if it been LinkedList we would use him instead default ArrayList
     */
    public Bucket(Product[] container) {
        this.container = container;
    }

    public void addProduct(Product product) {
        container[Product.productAmount - 1] = product;
    }

    public int getIndexById(Product[] container, int id) {
        for (int i = 0; i < Product.productAmount; i++) {
            if (container[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    //FIX ME
    public Product[] deleteProductByIndex(int index) {
        int oldSize = container.length;

        Product[] half1 = new Product[index - 1];
        for(int i = 0; i < index - 1; i++) {
            half1[i] = container[i];
        }

        Product[] half2 = new Product[oldSize - index];
        for (int j = 0; j < oldSize - index; j++) {
            half2[j] = container[j];
        }

        Product[] concat = combine(half1, half2);
        this.container = concat;
        Product.increaseCount();

        return concat;
    }

    public Product[] getContainer() {
        return container;
    }

    private void setContainer(Product[] container) {
        this.container = container;
    }

    private static Product[] combine(Product[] a, Product[] b){
        int length = a.length + b.length;
        Product[] result = new Product[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    @Override
    public String toString() {
        StringBuffer msg = new StringBuffer("List of products: \n");
        for (int i = 0; i < container.length; i++) {
            if (container[i] != null) {
                msg.append(container[i]).append("\n");
            }
        }
        return msg.toString();
    }
}
