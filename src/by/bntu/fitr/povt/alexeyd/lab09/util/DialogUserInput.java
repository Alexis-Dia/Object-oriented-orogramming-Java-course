package by.bntu.fitr.povt.alexeyd.lab09.util;

import java.util.Scanner;

public class DialogUserInput {

    private static final  String[] OPTION_YES_VARIANTS = {"YES","Yes", "yes"};
    private static final String OPTION_NO = "No";

    /**
     *
     * @param msg
     * @return number from input
     */
    public static boolean input(String msg) {

        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Initialize input Number
        String answer = "";
        boolean repeatAgain;
        while (true) {
            //Print to console msg
            System.out.println(msg + " \n\t ");
            if (scanner.hasNext()) {
                answer = scanner.next();
                if (optionIsExists(answer)) {
                    repeatAgain = true;
                    break;
                } else if (answer.equals(OPTION_NO)) {
                    repeatAgain = false;
                    break;
                }
            } else {
                //clears buffer
                scanner.nextLine();
            }
        }
        return repeatAgain;
    }

    private static boolean optionIsExists(String answer) {
        for (int i = 0; i < OPTION_YES_VARIANTS.length; i++)
            if (OPTION_YES_VARIANTS[i].equals(answer)) {
                return true;
            }
        return false;
    }

}
