package by.bntu.fitr.povt.alexeyd.lab7.util;

import java.util.Scanner;

public class UserInput {

    //Static method which return number from input.
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize length of triangle side
        int age;
        while (true) {
            //Print to console message
            System.out.print(msg + " \n ");
            if (scanner.hasNextBigInteger()) {
                age = scanner.nextInt();
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
