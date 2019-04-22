package by.bntu.fitr.povt.alexeyd.lab4;

import java.util.Scanner;

public class InputUtils {

    //Static method which return length of triangle side.
    static double inputTriangleSide(Scanner scanner, String nameSide) {
        //Initialize length of triangle side
        double sideLength;
        while (true) {
            //Print to console triangle side
            System.out.print("Input side " + nameSide + ": ");
            if (scanner.hasNextDouble()) {
                sideLength = scanner.nextDouble();
                break;
            } else {
                // clears buffer
                scanner.nextLine();
            }
        }
        return sideLength;
    }
}
