package by.bntu.fitr.povt.alexeyd.lab7.model.logic;

public class HeadsCalculator {

    private final static int INIT_HEAD = 3;
    private final static int ONE_HUNDREAD_YEARS = 100;
    private final static int TWO_HUNDREAD_YEARS = 200;

    //Method takes parameter - radius of circle and returns length of circle
    public static double calculateHeads(double age) {
        if (age > TWO_HUNDREAD_YEARS) {
            return 1;
        } else if (age == TWO_HUNDREAD_YEARS) {
            return 2;
        } else if (age > ONE_HUNDREAD_YEARS && age < TWO_HUNDREAD_YEARS) {
            return 2;
        } else if (age == ONE_HUNDREAD_YEARS) {
            return 2;
        } else
            return 3;
    }

}
