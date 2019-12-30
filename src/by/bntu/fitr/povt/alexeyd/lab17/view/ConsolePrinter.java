package by.bntu.fitr.povt.alexeyd.lab17.view;

import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;

import java.util.List;

public class ConsolePrinter implements Printer {
    public void write(List<Product> products) {
        System.out.print(products);
    }

    public void printMultiArr(int[][] arr) {
        write("Initial multi array = \n");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                write(arr[row][col] + " ");
            }
            write("\n");
        }
        write("\n");
    }

    /**
     * Print to the console finaly result
     * @param arr
     */
    public void write(int[] arr) {
        System.out.print("[");
        for (int element: arr) {
            System.out.print(element + " ");
        };
        System.out.print("]");
    }

    /**
     * Print to the console finaly result
     * @param ob
     */
    public void write(Object ob) {
        System.out.println(ob);
    }
}
