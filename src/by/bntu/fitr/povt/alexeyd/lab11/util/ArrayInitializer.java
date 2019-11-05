package by.bntu.fitr.povt.alexeyd.lab11.util;

import java.util.Random;

public class ArrayInitializer {
    public static void rndInit(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
    }

}
