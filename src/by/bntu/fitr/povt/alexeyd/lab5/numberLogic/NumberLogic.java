package by.bntu.fitr.povt.alexeyd.lab5.numberLogic;

public class NumberLogic {

    private static double sumNumberOfDigit = 2;
    private static double multipleNumberOfDigit = 2;

    //Method returns summ all digits
    public static int sumAllDigits(int number) {
        int sum = number % 10;
        //Check, if number completely divided to 10 or not, if yes - call this method recursively again
        if (number / 10 < 10) {
            return sum + number / 10;
        } else {
            ++sumNumberOfDigit;
            return sum + sumAllDigits(number / 10);
        }
    }

    //Method returns multiplication of all digits
    public static int multipleAllDigits(int number) {
        int sum = number % 10;
        //Check, if number completely divided to 10 or not, if yes - call this method recursively again
        if (number / 10 < 10) {
            return sum * number / 10;
        } else {
            ++multipleNumberOfDigit;
            return sum * multipleAllDigits(number / 10);
        }
    }

    public static double getAverageArithmetic(int number) {
        if (number < 11) {
            return number;
        }
        double averageArithmetic = sumAllDigits(number) / sumNumberOfDigit;
        return averageArithmetic;
    }

    public static double getAverageGeometric(int number) {
        if (number < 11) {
            return number;
        }
        double multiplication = multipleAllDigits(number);
        double degree  = 1 / multipleNumberOfDigit;
        double averageGeometric = Math.pow(multiplication, degree);
        return averageGeometric;
    }
}
