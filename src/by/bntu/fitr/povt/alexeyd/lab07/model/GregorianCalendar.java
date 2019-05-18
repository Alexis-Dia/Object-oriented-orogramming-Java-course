package by.bntu.fitr.povt.alexeyd.lab07.model;

public class GregorianCalendar {

    private static final int JANUARY_DAYS = 31;
    private int FEBRUARY_DAYS = 28;
    private static final int MARCH_DAYS = 31;
    private static final int APRIL_DAYS = 30;
    private static final int MAY_DAYS = 31;
    private static final int JUNE_DAYS = 30;
    private static final int JULE_DAYS = 31;
    private static final int AUGUST_DAYS = 31;
    private static final int SEPTEMBER_DAYS = 30;
    private static final int OCTOBER_DAYS = 31;
    private static final int NOVEMBER_DAYS = 30;
    private static final int DECEMBER_DAYS = 31;
    private int currentYear;
    private int currentMonth;
    private int currentDay;
    private int year;
    private int month;
    private int day;

    public GregorianCalendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        isLeapYear();
    }

    public String getNextDay() {

        switch (this.month) {
            case 0:
                calculateNextDay(JANUARY_DAYS);
                break;
            case 1:
                calculateNextDay(FEBRUARY_DAYS);
                break;
            case 2:
                calculateNextDay(MARCH_DAYS);
                break;
            case 3:
                calculateNextDay(APRIL_DAYS);
                break;
            case 4:
                calculateNextDay(MAY_DAYS);
                break;
            case 5:
                calculateNextDay(JUNE_DAYS);
                break;
            case 6:
                calculateNextDay(JULE_DAYS);
                break;
            case 7:
                calculateNextDay(AUGUST_DAYS);
                break;
            case 8:
                calculateNextDay(SEPTEMBER_DAYS);
                break;
            case 9:
                calculateNextDay(OCTOBER_DAYS);
                break;
            case 10:
                calculateNextDay(NOVEMBER_DAYS);
                break;
            case 11:
                calculateNextDay(DECEMBER_DAYS);
                break;
        }
        return this.currentYear + "-" + this.currentMonth + "-" + this.currentDay;
    }

    private void calculateNextDay(int numberOfDaysOfMonth) {
        if (this.day > 0 && this.day < numberOfDaysOfMonth) {
            this.currentDay = this.day + 1;
            this.currentMonth = this.month;
            this.currentYear = this.year;
        } else if (this.day == numberOfDaysOfMonth) {
            this.currentDay = 1;
            this.currentMonth = this.month + 1;
            this.currentYear = this.year;
        }
    }

    private void isLeapYear() {
        int remainderFromFour = this.year % 4;
        int remainderFromFourHundreads = this.year % 400;
        if (remainderFromFour == 0 && remainderFromFourHundreads == 0) {
            this.FEBRUARY_DAYS = 29;
        }
    }

}
