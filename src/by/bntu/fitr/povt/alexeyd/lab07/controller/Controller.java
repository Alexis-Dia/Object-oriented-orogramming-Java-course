package by.bntu.fitr.povt.alexeyd.lab07.controller;

import by.bntu.fitr.povt.alexeyd.lab07.model.GregorianCalendar;
import by.bntu.fitr.povt.alexeyd.lab07.model.HeadsCalculator;
import by.bntu.fitr.povt.alexeyd.lab07.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab07.util.calendar.DayInput;
import by.bntu.fitr.povt.alexeyd.lab07.util.calendar.MonthInput;
import by.bntu.fitr.povt.alexeyd.lab07.util.calendar.YearInput;
import by.bntu.fitr.povt.alexeyd.lab07.view.Printer;

public class Controller {

    public void executeTask1 () {

        //Statics method which returns double number from input:
        int age = UserInput.input("Input age:");

        //Methods which take TWO parameters - sides of rectangle and returns perimeter and area:
        int numberOfHeads = HeadsCalculator.calculateHeads(age);

        //Print to the console finaly results:
        Printer.print("Number of heads with age = " + age + " : ");
        Printer.print("" + numberOfHeads);
    }

    public void executeTask2 () {
        //Statics method which returns int number from input:
        int year = YearInput.input("Input year:");

        //Statics method which returns int number from input:
        int month = MonthInput.input("Input month:");

        //Statics method which returns int number from input:
        int day = DayInput.input("Input day:");

        //Int construcor which take three parameters - year, month, day and returns next day in Gregorian calendarInputs format:
        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month, day);

        //Getting next day
        String nextDay = gregorianCalendar.getNextDay();

        //Print to the console finaly results:
        Printer.print("Next day in Gregorian calendarInputs format with year = " + year + ", month = " + month + ", day =  " + day + " : ");
        Printer.print(nextDay);
    }

}
