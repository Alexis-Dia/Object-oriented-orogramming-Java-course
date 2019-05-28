package by.bntu.fitr.povt.alexeyd.lab09.util;

import java.util.Scanner;

public class EvenUserInput {

    /**
     *
     * @param msg
     * @return number from input
     */
    public static int input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize input Number
        int inputNumber;
        while (true) {
            //Print to console msg
            System.out.println(msg + " \n\t ");
            if (scanner.hasNextBigInteger()) {
                inputNumber = scanner.nextInt();
                if (inputNumber > 0 && inputNumber % 2 == 0 && inputNumber < 9) {
                    break;
                }
            } else {
                //clears buffer
                scanner.nextLine();
            }
        }
        return inputNumber;
    }
}
