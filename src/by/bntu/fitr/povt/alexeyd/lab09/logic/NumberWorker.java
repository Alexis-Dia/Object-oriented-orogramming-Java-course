package by.bntu.fitr.povt.alexeyd.lab09.logic;

public class NumberWorker {

    public static int calculateHappyNumbers(int rank) {
        int sum = 0;
        int i, j, k;
        int maxNumberByRank = getMaxNumberByRank(rank);
        int[] ticket = new int[6];
        for (i = 1; i <= maxNumberByRank; i++) {
            for (k = i, j = 0; j < rank; j++, k /= 10)
                ticket[j] = k % 10;
            if (halfsIsEquals(rank, ticket))
                ++sum;
        }
        return sum;
    }

    private static int getMaxNumberByRank(int rank) {
        int number = (int) Math.pow(10, rank) - 1;
        return number;
    }

    private static boolean halfsIsEquals(int rank, int[] ticket) {
        int half = rank/2;
        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;

        for (int i = 0; i < half; i++)
            sumOfFirstHalf += ticket[i];

        int j, k;
        for (j = half, k = 0; j < rank; j++, k++) {
            sumOfSecondHalf += ticket[j];
        }

        return sumOfFirstHalf == sumOfSecondHalf;
    }

}
