package by.bntu.fitr.povt.alexeyd.lab05.inputUtils;

import java.util.Scanner;

public class InputUtils {

    //Static method which return number from input.
    public static int getNumberFromInput(Scanner scanner) {
        //Initialize length of triangle side
        int sideLength;
        while (true) {
            //Print to console triangle side
            System.out.print("Input your int number: \n ");
            if (scanner.hasNextInt()) {
                sideLength = scanner.nextInt();
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
