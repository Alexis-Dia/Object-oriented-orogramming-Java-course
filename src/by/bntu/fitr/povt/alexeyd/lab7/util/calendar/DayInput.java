package by.bntu.fitr.povt.alexeyd.lab7.util.calendar;

import java.util.Scanner;

public class DayInput {

    //Static method which return number from input.
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize length of triangle side
        int day;
        while (true) {
            //Print to console triangle side
            System.out.print(msg + " \n ");
            if (scanner.hasNextBigInteger()) {
                day = scanner.nextInt();
                //Break if character is and > 0 and <= 31.
                if (day > 0 && day <= 31) {
                    break;
                }
            } else {
                // clears buffer
                scanner.nextLine();
            }
        }
        return day;
    }
}
