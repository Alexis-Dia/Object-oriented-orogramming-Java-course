package by.bntu.fitr.povt.alexeyd.lab08.model.logic;

public class NumberWorker {

    public static final int ONE_HUNDRED = 100;
    public static final int DECIMAL_NOTATION_BASE = 10;
    public static final int DECIMAL_EVEN_NUMBER = 2;

    public static int countQuantityOfNumberDigit(long number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= DECIMAL_NOTATION_BASE;
        }
        return count;
    }

    public static int countSumOfNumberDigit(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % DECIMAL_NOTATION_BASE;
            number /= DECIMAL_NOTATION_BASE;
        }
        return sum;
    }

    public static int countOfEvenNumber(long number) {
        int count = 0;
        while (number > 0) {
            int reminder = (int) (number % DECIMAL_NOTATION_BASE);
            number /= DECIMAL_NOTATION_BASE;
            if (reminder % DECIMAL_EVEN_NUMBER == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOfOddNumber(long number) {
        int count = 0;
        while (number > 0) {
            int reminder = (int) (number % DECIMAL_NOTATION_BASE);
            number /= DECIMAL_NOTATION_BASE;
            if (reminder % DECIMAL_EVEN_NUMBER != 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkEvenPrevails (long number) {
        boolean evenPrevails = false;
        int numberOfEven = countOfEvenNumber(number);
        int numberOfOdd = countOfOddNumber(number);
        if (numberOfEven > numberOfOdd) {
            return true;
        }
        return evenPrevails;
    }

    public static long getReversedNumber(long number) {
        long reversed = 0;
        int nubmerOfDecade = 1;
        while (number != 0) {
            long digit = number % DECIMAL_NOTATION_BASE;
            if (digit == 0) {
                nubmerOfDecade *= DECIMAL_NOTATION_BASE;
            }
            reversed = reversed * DECIMAL_NOTATION_BASE + digit;
            number /= DECIMAL_NOTATION_BASE;
        }
        return reversed * nubmerOfDecade;
    }

    public static int getMaxNumber(long number) {
        int maxNumber = 0;
        while (number > 0) {
            long digit = number % DECIMAL_NOTATION_BASE;
            number /= DECIMAL_NOTATION_BASE;
            if (digit > maxNumber) {
                maxNumber = (int) digit;
            }
        }
        return maxNumber;
    }

    public static long getIncreasedNumber(long number, int maxDigit) {
        long reversed = 0;
        while (number != 0) {
            long digit = number % DECIMAL_NOTATION_BASE;
            if (digit == maxDigit) {
                reversed = reversed * ONE_HUNDRED + digit * DECIMAL_NOTATION_BASE + digit;
            } else {
                reversed = reversed * DECIMAL_NOTATION_BASE + digit;
            }
            number /= DECIMAL_NOTATION_BASE;
        }
        reversed = getReversedNumber(reversed);
        return reversed;
    }
}
