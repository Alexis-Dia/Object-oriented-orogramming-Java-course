package by.bntu.fitr.povt.alexeyd.lab5.numberLogic;

public class NumberLogic {

    private static double sumNumberOfDigit = 2;
    private static double mulNumberOfDigit = 2;

    //Method returns summ all digits
    public static int getSumOfAllDigits(int number) {
        int sum = number % 10;
        //Check, if number completely divided to 10 or not, if yes - call this method recursively again
        if (number / 10 < 10) {
            return sum + number / 10;
        } else {
            ++sumNumberOfDigit;
            return sum + getSumOfAllDigits(number / 10);
        }
    }

    //Method returns multiplication of all digits
    public static int multipleAllDigits(int number) {
        int mul = number % 10;
        //Check, if number completely divided to 10 or not, if yes - call this method recursively again
        if (number / 10 < 10) {
            return mul * number / 10;
        } else {
            ++mulNumberOfDigit;
            return mul * multipleAllDigits(number / 10);
        }
    }

    public static double getAverageArithmetic(int number) {
        if (number < 11) {
            return number;
        }
        double averageArithmetic = getSumOfAllDigits(number) / sumNumberOfDigit;
        return averageArithmetic;
    }

    public static double getAverageGeometric(int number) {
        if (number < 11) {
            return number;
        }
        double multiplication = multipleAllDigits(number);
        double degree  = 1 / mulNumberOfDigit;
        double averageGeometric = Math.pow(multiplication, degree);
        return averageGeometric;
    }
}
