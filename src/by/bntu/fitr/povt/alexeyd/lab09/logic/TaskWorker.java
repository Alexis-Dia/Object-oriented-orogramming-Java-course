package by.bntu.fitr.povt.alexeyd.lab09.logic;

import java.util.Random;

public class TaskWorker {

    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public static int[] taskGenerator() {
        int a = generateNumber();
        int b = generateNumber();
        int c = a * b;
        return new int[] {a, b};
    }

    private static int generateNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
}
