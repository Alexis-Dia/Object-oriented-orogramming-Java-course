package by.bntu.fitr.povt.alexeyd.lab7.util.calendar;

import java.util.Scanner;

public class MonthInput {

    //Static method which return number from input.
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize length of triangle side
        int month;
        while (true) {
            //Print to console triangle side
            System.out.print(msg + " \n ");
            if (scanner.hasNextBigInteger()) {
                month = scanner.nextInt();
                //Break if character is double and > 0 and <=12.
                if (month > 0 && month <= 12) {
                    break;
                }
            } else {
                // clears buffer
                scanner.nextLine();
            }
        }
        return month;
    }
}
