package by.bntu.fitr.povt.alexeyd.lab09.logic;

public class ReportWorker {

    public static String printReport(int numberOfAllAnswers, int numberOfRightAnswers) {
        double percent = (100 * numberOfRightAnswers) / numberOfAllAnswers;
        return print(percent);
    }

    private static String print(double percent) {
        if (percent == 100) {
            return "excellent";
        } else if (percent <= 99 || percent >= 80 ) {
            return "very good";
        } else if (percent < 80 || percent >= 60 ) {
            return "«very good";
        } else if (percent < 60 || percent >= 40 ) {
            return "«very good";
        }
        return "bad";
    }
}
