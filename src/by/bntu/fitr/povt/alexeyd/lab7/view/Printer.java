package by.bntu.fitr.povt.alexeyd.lab7.view;

public class Printer {

    private static final String ERROR_MESSAGE = "There is no date with these month and date!";

    /**
     * Print to the console finaly result
     * @param msg
     */
    public static void print(String msg) {
        boolean dateIsCorrect =checkCorrectData(msg);
        if (dateIsCorrect) {
            System.out.println(msg);
        } else {
            System.out.println(ERROR_MESSAGE);
        }
    }

    /**
     * Method check date which user entered
     * @param msg
     * @return
     */
    private static boolean checkCorrectData(String msg) {
        boolean dateIsCorrect = true;
        if (msg.equals("0-0-0")) {
            dateIsCorrect = false;
        }
        return dateIsCorrect;
    }
}
