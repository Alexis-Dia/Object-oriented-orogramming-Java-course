package by.bntu.fitr.povt.alexeyd.lab09.logic;

import by.bntu.fitr.povt.alexeyd.lab09.dto.Border;

public class CalenderWorker {

    private static final int[] NUMBERS_OF_DAYS_IN_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    private static final int START_INDEX = 0;
    private static final int END_INDEX = 11;

    private static final String ERR_MONTH_MSG = "Index of month is out of range!";
    private static final String AQUARIUS = "AQUARIUS";
    private static final String PISCES = "PISCES";
    private static final String ARIES = "ARIES";
    private static final String TAURUS = "TAURUS";
    private static final String GERMINI = "GERMINI";
    private static final String CANCER = "CANCER";
    private static final String LEO = "LEO";
    private static final String VIRGO = "VIRGO";
    private static final String LIBRA = "LIBRA";
    private static final String SCORPIO = "SCORPIO";
    private static final String SAGGITTARIUS = "SAGGITTARIUS";
    private static final String CAPRICORN = "CAPRICORN";

    private static final Border BORDER_1 = new Border(2, 18);
    private static final Border BORDER_2 = new Border(3, 20);
    private static final Border BORDER_3 = new Border(4, 19);
    private static final Border BORDER_4 = new Border(5, 20);
    private static final Border BORDER_5 = new Border(6, 21);
    private static final Border BORDER_6 = new Border(7, 22);
    private static final Border BORDER_7 = new Border(8, 22);
    private static final Border BORDER_8 = new Border(9, 22);
    private static final Border BORDER_9 = new Border(10, 22);
    private static final Border BORDER_10 = new Border(11, 22);
    private static final Border BORDER_11 = new Border(12, 21);
    private static final Border BORDER_12 = new Border(1, 20);

    public String getNumberOfDaysInMonth(int numberOfMonth) {
        int index = numberOfMonth - 1;
        if (index >= START_INDEX && index <= END_INDEX) {
            return setNumberOfDaysInMonth(index);
        } else {
            return ERR_MONTH_MSG;
        }
    }

    public String getZodiacSign(Border birthDay) {
        String zodiacSign = "";

        if (isBirthdayInBorder(birthDay, BORDER_12, BORDER_1)) {
            zodiacSign = AQUARIUS;
        } else if (isBirthdayInBorder(birthDay, BORDER_1, BORDER_2)) {
            zodiacSign = PISCES;
        } else if (isBirthdayInBorder(birthDay, BORDER_2, BORDER_3)) {
            zodiacSign = ARIES;
        } else if (isBirthdayInBorder(birthDay, BORDER_3, BORDER_4)) {
            zodiacSign = TAURUS;
        } else if (isBirthdayInBorder(birthDay, BORDER_4, BORDER_5)) {
            zodiacSign = GERMINI;
        } else if (isBirthdayInBorder(birthDay, BORDER_5, BORDER_6)) {
            zodiacSign = CANCER;
        } else if (isBirthdayInBorder(birthDay, BORDER_6, BORDER_7)) {
            zodiacSign = LEO;
        } else if (isBirthdayInBorder(birthDay, BORDER_7, BORDER_8)) {
            zodiacSign = VIRGO;
        } else if (isBirthdayInBorder(birthDay, BORDER_9, BORDER_10)) {
            zodiacSign = LIBRA;
        } else if (isBirthdayInBorder(birthDay, BORDER_10, BORDER_11)) {
            zodiacSign = SCORPIO;
        } else if (isBirthdayInBorder(birthDay, BORDER_11, BORDER_12)) {
            zodiacSign = SAGGITTARIUS;
        } else {
            zodiacSign = CAPRICORN;
        }
        return zodiacSign;
    }

    private String setNumberOfDaysInMonth(int indexOfMonth) {
       return String.valueOf(NUMBERS_OF_DAYS_IN_MONTHS[indexOfMonth]);
    }

    private boolean isBirthdayInBorder(Border birthDay, Border border12, Border border1) {
        return isMore(birthDay, border12) && isLess(birthDay, border1);
    }

    private boolean isMore(Border border1, Border border2) {
        if ((border1.getMonth() - 1 == border2.getMonth()) ||
                (border1.getMonth() == border2.getMonth() && (border1.getDay() >= border2.getDay()))) {
            return true;
        }
        return false;
    }

    private boolean isLess(Border border1, Border border2) {
        if ((border1.getMonth() + 1 == border2.getMonth()) ||
                (border1.getMonth() == border2.getMonth() && (border1.getDay() <= border2.getDay()))) {
            return true;
        }
        return false;
    }

}
