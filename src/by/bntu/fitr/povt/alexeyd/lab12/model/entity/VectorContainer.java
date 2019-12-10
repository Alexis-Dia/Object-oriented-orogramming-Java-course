package by.bntu.fitr.povt.alexeyd.lab12.model.entity;

public class VectorContainer {

    private static final int DEFAULT_SIZE = 10;

    public static int vectorAmount;

    private int[] container = new int[DEFAULT_SIZE];

    private String name;

    /* static initialization block (it's called only once) */
    static {
        vectorAmount = 0;
    }

    public VectorContainer() {
    }

    public VectorContainer(String name) {
        this.name = name;
    }

    public void addElement (int element) {
        vectorAmount++;
        container[VectorContainer.vectorAmount - 1] = element;
/*        for (int i = 0; i < container.length; i++) {
            if (container[i] == 0) {
                container[i] = -1;
            }
        }*/
    }

    public int[] getContainer() {
        return container;
    }

    public void setContainer(int[] container) {
        this.container = container;
    }

    @Override
    public String toString() {
        String line = "";
        for (int element: container) {
            line = line + element + ", ";
        }
        return "VectorContainer{" +
                "container=" + line +
                '}';
    }
}
