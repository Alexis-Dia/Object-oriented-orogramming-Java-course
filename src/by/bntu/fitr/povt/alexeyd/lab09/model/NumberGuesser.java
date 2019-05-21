package by.bntu.fitr.povt.alexeyd.lab09.model;

public class NumberGuesser {

    private static final String HIGHER = "Higher";
    private static final String LOWER = "Lower";
    private static final String CONGRATULATIONS = "Congratulations!!!!";

    public String validateResult(int random, int userAnswer) {
        if (userAnswer < random) {
            return HIGHER;
        } else if (userAnswer > random) {
            return LOWER;
        }
        return CONGRATULATIONS;
    }
}
