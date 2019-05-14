package by.bntu.fitr.povt.alexeyd.lab09.logic;

import java.util.Random;

public class PlayWorker {

    public static final int ZERO = 0;
    public static final int NUMBER_OF_ATTEPMTS = 1000;
    public static final int TWO = 2;

    public static int[] playHeadsOrTails() {
        int heads = ZERO;
        int tails = ZERO;
        for (int i = 0; i < NUMBER_OF_ATTEPMTS; i++) {
            Random rand = new Random();
            int randomValue = rand.nextInt() % TWO;
            if (randomValue == ZERO) {
                heads++;
            } else {
                tails++;
            }
        }
        return new int[]{heads, tails};
    }

}
