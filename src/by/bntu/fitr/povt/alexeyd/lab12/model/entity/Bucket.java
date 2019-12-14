package by.bntu.fitr.povt.alexeyd.lab12.model.entity;

public class Bucket {

    private static final int DEFAULT_ROW_SIZE = 10;
    private static final int DEFAULT_COLUMN_SIZE = 10;

    private Product[][] container;
    private String name;

    {
        container = new Product[DEFAULT_ROW_SIZE][DEFAULT_COLUMN_SIZE];
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
    public Bucket(Product[][] container) {
        this.container = container;
    }

    public void addProduct(Product product, int subgroup) {
        container[subgroup][Product.productAmount - 1] = product;
    }

    public int getIndexById(Product[][] container, int id, int subgroup) {
        for (int i = 0; i < container[subgroup].length; i++) {
            if (container[subgroup][i] != null) {
                if (container[subgroup][i].getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    //FIX ME
    public Product[][] deleteProductByIndex(int index, int subgroup) {
        int oldSize = container.length;

        Product[][] half1 = new Product[subgroup][index - 1];
        for(int i = 0; i < index - 1; i++) {
            half1[subgroup][i] = container[subgroup][i];
        }

        Product[][] half2 = new Product[subgroup][oldSize - index];
        for (int j = 0; j < oldSize - index; j++) {
            half2[subgroup][j] = container[subgroup][j];
        }

        Product[][] concat = combine(half1, half2, subgroup);
        this.container = concat;
        Product.increaseCount();

        return concat;
    }

    public Product[][] getContainer() {
        return container;
    }

    private void setContainer(Product[][] container) {
        this.container = container;
    }

    private static Product[][] combine(Product[][] a, Product[][] b, int subgroup){
        int length = a.length + b.length;
        Product[][] result = new Product[subgroup][length];
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
