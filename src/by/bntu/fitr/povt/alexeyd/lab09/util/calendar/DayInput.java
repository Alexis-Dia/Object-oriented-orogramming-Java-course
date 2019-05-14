package by.bntu.fitr.povt.alexeyd.lab09.util.calendar;

import java.util.Scanner;

public class DayInput {

    //Static method which return number from input.
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize day
        int day;
        while (true) {
            //Print to console message
            System.out.print(msg + " \n\t ");
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
