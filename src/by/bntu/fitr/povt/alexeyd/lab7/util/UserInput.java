package by.bntu.fitr.povt.alexeyd.lab7.util;

import java.util.Scanner;

public class UserInput {

    //Static method which return number from input.
    public static double input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize length of triangle side
        double age;
        while (true) {
            //Print to console triangle side
            System.out.print(msg + " \n ");
            if (scanner.hasNextDouble()) {
                age = scanner.nextDouble();
                //Break if character is double and > 0.
                if (age > 0) {
                    break;
                }
            } else {
                // clears buffer
                scanner.nextLine();
            }
        }
        return age;
    }
}
