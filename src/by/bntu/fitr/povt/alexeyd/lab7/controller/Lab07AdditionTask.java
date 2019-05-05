package by.bntu.fitr.povt.alexeyd.lab7.controller;

import by.bntu.fitr.povt.alexeyd.lab7.model.logic.GregorianCalendar;
import by.bntu.fitr.povt.alexeyd.lab7.util.calendar.*;
import by.bntu.fitr.povt.alexeyd.lab7.view.Printer;

/**
 * Number of laboratory work is №7. Java Basic Syntax. Conditional Statements. Branching Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 05.05.2019, v1.1. Number of group is 30701117.
 * Additional task. Develop a program that cont next day in Gregorian calendar format.
 */
public class Lab07AdditionTask {

    public static void main(String[] args) {

        //Statics method which returns int number from input:
        int year = YearInput.input("Input year:");

        //Statics method which returns int number from input:
        int month = MonthInput.input("Input month:");

        //Statics method which returns int number from input:
        int day = DayInput.input("Input day:");

        //Int construcor which take three parameters - year, month, day and returns next day in Gregorian calendar format:
        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month, day);

        //Getting next day
        String nextDay = gregorianCalendar.getNextDay();

        //Print to the console finaly results:
        Printer.print("Next day in Gregorian calendar format with year = " + year + ",month = " + month + ",day =  " + day + " : ");
        Printer.print(nextDay);
    }
}
