package by.bntu.fitr.povt.alexeyd.lab15.view;

public class ConsolePrinter implements Printer {
    public void write(String msg) {
        System.out.print(msg);
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
