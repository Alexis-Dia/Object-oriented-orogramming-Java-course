package by.bntu.fitr.povt.alexeyd.lab7.model.logic;

public class HeadsCalculator {

    private final static int NUMBER_OF_HEADS_IN_FIRST_200 = 600;
    private final static int NUMBER_OF_HEADS_IN_FIRST_300 = 800;
    private final static int NUMBER_OF_HEADS_IN_NEXT_300 = 300;
    private final static int TWO_HUNDREAD_YEARS = 200;
    private final static int THREE_HUNDREAD_YEARS = 300;
    private final static int GROWING_SPEED_1 = 1;
    private final static int GROWING_SPEED_2 = 2;
    private final static int GROWING_SPEED_3 = 3;
    private final static int INIT_HEAD = 3;
    private static int numberOfHeads = INIT_HEAD;
    private static int numberOfThreeHundreds = 1;

    /**
     * Method takes parameter - radius of circle and returns length of circle
     * @param age
     * @return
     */
    public static int calculateHeads(int age) {
        if (age > THREE_HUNDREAD_YEARS) {
            numberOfThreeHundreds = age / THREE_HUNDREAD_YEARS;
                if (numberOfThreeHundreds ==  1) {
                    calculateHeadsCase1(age);
                } else {
                    calculateHeadsCase2(age);
                }
            numberOfHeads += NUMBER_OF_HEADS_IN_FIRST_300;
            return numberOfHeads;
        } else if (age > TWO_HUNDREAD_YEARS && age <= THREE_HUNDREAD_YEARS) {
            calculateHeadsCase3(age);
            return numberOfHeads;
        } else
            numberOfHeads += age * GROWING_SPEED_3;
            return numberOfHeads;
    }

    /**
     * Method returns number of heads for case when age > 300 but < 600
     * @param age
     */
    private static void calculateHeadsCase3(int age) {
        int difference = age -  TWO_HUNDREAD_YEARS;
        numberOfHeads += NUMBER_OF_HEADS_IN_FIRST_200;
        numberOfHeads += difference * GROWING_SPEED_2;
    }

    /**
     * Method returns number of heads for case when age >600
     * @param age
     */
    private static void calculateHeadsCase1(int age) {
        int difference = age - THREE_HUNDREAD_YEARS;
        numberOfHeads += difference * GROWING_SPEED_1;
    }

    /**
     * Method returns number of heads for case when age > 200 and < 300
     * @param age
     */
    private static void calculateHeadsCase2(int age) {
        int difference = age - numberOfThreeHundreds * THREE_HUNDREAD_YEARS;
        numberOfHeads += numberOfThreeHundreds * THREE_HUNDREAD_YEARS;
        numberOfHeads += difference * GROWING_SPEED_1;
        numberOfHeads -= NUMBER_OF_HEADS_IN_NEXT_300;
    }

}
