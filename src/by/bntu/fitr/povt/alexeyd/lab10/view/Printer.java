package by.bntu.fitr.povt.alexeyd.lab10.view;

public class Printer {

    /**
     * Print to the console finaly result
     * @param msg
     */
    public static void print(String msg) {
        System.out.println(msg);
    }

    /**
     * Print to the console finaly result
     * @param arr
     */
    public static void print(int[] arr) {
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
    public static void print(Object ob) {
        System.out.println(ob);
    }

}
