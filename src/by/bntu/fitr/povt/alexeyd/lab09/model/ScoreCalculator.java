package by.bntu.fitr.povt.alexeyd.lab09.model;

public class ScoreCalculator {

    public static String getResult(int numberOfAllAnswers, int numberOfRightAnswers) {
        double percent = (100 * numberOfRightAnswers) / numberOfAllAnswers;
        return calculateMark(percent);
    }

    private static String calculateMark(double percent) {
        if (percent == 100) {
            return "excellent";
        } else if (percent <= 99 && percent >= 80) {
            return "very good";
        } else if (percent < 80 && percent >= 60) {
            return "good";
        } else if (percent < 60 && percent >= 40) {
            return "satisfactory";
        }
        return "bad";
    }
}
