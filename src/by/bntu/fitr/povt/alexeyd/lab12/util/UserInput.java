package by.bntu.fitr.povt.alexeyd.lab12.util;

import java.util.Scanner;

public class UserInput {

    /**
     *
     * @param msg
     * @return number from input
     */
    public static long input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize unputNumber
        long inputNumber;
        while (true) {
            //Print to console msg
            System.out.print(msg + " ");
            if (scanner.hasNextBigInteger()) {
                inputNumber = scanner.nextInt();
                break;
            } else {
                //clears buffer
                scanner.nextLine();
            }
        }
        return inputNumber;
    }
}
