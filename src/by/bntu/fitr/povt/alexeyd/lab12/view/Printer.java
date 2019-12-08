package by.bntu.fitr.povt.alexeyd.lab12.view;

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
}
