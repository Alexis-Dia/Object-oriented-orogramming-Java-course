package by.bntu.fitr.povt.alexeyd.lab20.utils;

import java.util.Random;

public class BusStationUtils {

    private static final int LOW_PLATE_NUMBER = 1000;
    private static final int HIGH_BACK_PLATE_NUMBER = 8999;
    private static final int NUMERAL_O = 48;
    private static final int LETTER_Z = 122;
    private static final int TARGET_STRING_LENGTH = 2;
    private static final int START_POSITION = 1;
    private static final int CHARACTER_1_POSITION = 57;
    private static final int CHARACTER_2_POSITION = 65;
    private static final int CHARACTER_3_POSITION = 90;
    private static final int CHARACTER_4_POSITION = 97;
    public static final int HIGH_OCCUPYING_TIME = 30;
    public static final int LOW_OCCUPYING_TIME = 1;
    public static final String DASH = "-";
    private static Random random = new Random();

    public static int generateRandomOccupyingTimeOfParking () {
        int result = random.nextInt(HIGH_OCCUPYING_TIME) + LOW_OCCUPYING_TIME;
        return result;
    }

    public static String generateCarBackplateNumber () {
        String backplateNumber = "";
        backplateNumber = generatingRandomAlphanumeric();
        int result = random.nextInt(HIGH_BACK_PLATE_NUMBER) + LOW_PLATE_NUMBER;
        backplateNumber += DASH;
        backplateNumber += result;
        return backplateNumber;
    }

    public static String generatingRandomAlphanumeric() {
        int leftLimit = NUMERAL_O; // numeral '0'
        int rightLimit = LETTER_Z; // letter 'z'
        int targetStringLength = TARGET_STRING_LENGTH;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + START_POSITION)
            .filter(i -> (i <= CHARACTER_1_POSITION || i >= CHARACTER_2_POSITION) &&
                (i <= CHARACTER_3_POSITION || i >= CHARACTER_4_POSITION))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

        return generatedString.toUpperCase();
    }

}
