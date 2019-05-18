package by.bntu.fitr.povt.alexeyd.lab07.util.calendar;

import java.util.Scanner;

public class YearInput {

    //Static method which return number from input.
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize year
        int year;
        while (true) {
            //Print to console message
            System.out.print(msg + " \n ");
            if (scanner.hasNextBigInteger()) {
                year = scanner.nextInt();
                //Break if character is double and 999 and <= 9999.
                if (year > 999 && year <= 9999) {
                    break;
                }
            } else {
                // clears buffer
                scanner.nextLine();
            }
        }
        return year;
    }
}
