package by.bntu.fitr.povt.alexeyd.lab11.controller;

import by.bntu.fitr.povt.alexeyd.lab11.logic.ArrayWorker;
import by.bntu.fitr.povt.alexeyd.lab11.util.ArrayInitializer;

public class Lab11 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        ArrayInitializer.rndInit(array, -10, 10);
        int maxAbsValue = ArrayWorker.findElementByMaxModule(array);
        //Printer.print("\nArray: " + Arrays.toString(array));
        //Printer.print("\nMax abs element: " + maxAbsValue);
        //Printer.print("\nResult: " + result);

/*        int i, j = 0;
        label: for (i = 0; i < 10; i++) {
            System.out.println("iii = " + i);
            for (j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                if (i == 5 && j == 5){
                    break label;
                }
            }
        }
        System.out.println(i + " " + j);*/
    }

}
