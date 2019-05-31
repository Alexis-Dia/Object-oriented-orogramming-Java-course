package by.bntu.fitr.povt.alexeyd.lab10.util;

import java.util.Scanner;

public class UserInput {

    private final static int LEFT_BOARD = 0;
    private final static int RIGHT_BOARD = 100;

    /**
     *
     * @param msg
     * @return number from input
     */
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize unputNumber
        int inputNumber;
        while (true) {
            //Print to console msg
            System.out.println(msg + " ");
            if (scanner.hasNextBigInteger()) {
                inputNumber = scanner.nextInt();
                if (inputNumber > LEFT_BOARD && inputNumber < RIGHT_BOARD) {
                    break;
                }
                else {
                    //System.out.println(msg);
                    scanner.nextLine();
                }
                //break;
            } else {
                //clears buffer

                scanner.nextLine();
            }
        }
        return inputNumber;
    }
}
