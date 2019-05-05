package by.bntu.fitr.povt.alexeyd.lab7.model.logic;

public class HeadsCalculator {

    private final static int NUMBER_OF_HEADS_IN_FIRST_100 = 300;
    private final static int NUMBER_OF_HEADS_IN_FIRST_200 = 500;
    private final static int NUMBER_OF_HEADS_IN_NEXT_200 = 200;
    private final static int ONE_HUNDREAD_YEARS = 100;
    private final static int TWO_HUNDREAD_YEARS = 200;
    private final static int GROWING_SPEED_1 = 1;
    private final static int GROWING_SPEED_2 = 2;
    private final static int GROWING_SPEED_3 = 3;
    private final static int INIT_HEAD = 3;
    private static int numberOfHeads = INIT_HEAD;
    private static int numberOfTwoHundreds = 1;

    //Method takes parameter - radius of circle and returns length of circle
    public static int calculateHeads(int age) {
        if (age > TWO_HUNDREAD_YEARS) {
            numberOfTwoHundreds = age / TWO_HUNDREAD_YEARS;
                if (numberOfTwoHundreds ==  1) {
                    int difference = age - TWO_HUNDREAD_YEARS;
                    numberOfHeads += difference * GROWING_SPEED_1;
                } else {
                    int difference = age - numberOfTwoHundreds * TWO_HUNDREAD_YEARS;
                    numberOfHeads += numberOfTwoHundreds * TWO_HUNDREAD_YEARS;
                    numberOfHeads += difference * GROWING_SPEED_1;
                    numberOfHeads -= NUMBER_OF_HEADS_IN_NEXT_200;
                }
            numberOfHeads += NUMBER_OF_HEADS_IN_FIRST_200;
            return numberOfHeads;
        } else if (age > ONE_HUNDREAD_YEARS && age <= TWO_HUNDREAD_YEARS) {
            int difference = age -  ONE_HUNDREAD_YEARS;
            numberOfHeads += NUMBER_OF_HEADS_IN_FIRST_100;
            numberOfHeads += difference * GROWING_SPEED_2;
            return numberOfHeads;
        } else
            numberOfHeads += age * GROWING_SPEED_3;
            return numberOfHeads;
    }

}
