package by.bntu.fitr.povt.alexeyd.lab15.view;

public class Printer {
    public static void print(String msg) {
        System.out.print(msg);
    }

    public static void printArr(int[] arr) {
        print("Initial array = ");
        for (int i = 0; i < arr.length; i++) {
            print(arr[i] + " ");
        }
        print("\n");
    }

    public static void printMultiArr(int[][] arr) {
        print("Initial multi array = \n");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                print(arr[row][col] + " ");
            }
            print("\n");
        }
        print("\n");
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
