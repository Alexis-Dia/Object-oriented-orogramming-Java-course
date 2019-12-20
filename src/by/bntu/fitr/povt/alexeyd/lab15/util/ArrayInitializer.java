package by.bntu.fitr.povt.alexeyd.lab15.util;

import java.util.Random;

public class ArrayInitializer {

    public static void rndInit(int[][] array, int min, int max) {
        Random random = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = random.nextInt(max - min + 1) + min;
            }
        }
    }

    public static void initFromScaner(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = (int) UserInput.input("Input number of " + row + ":" + col + " element: ");
            }
        }
    }

}
