package by.bntu.fitr.povt.alexeyd.lab12.util;

import java.util.Random;

public class ArrayInitializer {
    public static void rndInit(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void initFromScaner(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) UserInput.input("Input number of " + i + " element: ");
        }
    }

}
