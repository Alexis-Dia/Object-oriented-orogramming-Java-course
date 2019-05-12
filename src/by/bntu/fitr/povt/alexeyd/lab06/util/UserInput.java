package by.bntu.fitr.povt.alexeyd.lab06.util;

import java.util.Scanner;

public class UserInput {

    //Static method which return number from input.
    public static double input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize side length
        double sideLength;
        while (true) {
            //Print to console message
            System.out.print(msg + " \n ");
            if (scanner.hasNextDouble()) {
                sideLength = scanner.nextDouble();
                //Break if character is double.
                break;
            } else {
                // clears buffer
                scanner.nextLine();
            }
        }
        return sideLength;
    }
}
