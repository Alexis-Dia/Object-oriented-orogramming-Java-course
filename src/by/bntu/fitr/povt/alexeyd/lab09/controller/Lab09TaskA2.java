package by.bntu.fitr.povt.alexeyd.lab09.controller;

import by.bntu.fitr.povt.alexeyd.lab09.logic.CalenderWorker;
import by.bntu.fitr.povt.alexeyd.lab09.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab09.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 14.05.2019, v1.1. Number of group is 30701117.
 * Task №A-2. Two non-negative integers are given: goi and month (an integer in the range of 1 to 12, where 1 is January,
 * 2 is February, 3 is March, etc.). Write a program that determines the number of days this month for a non-leap year.
 * If the numbers do not lie in the specified range, then output the appropriate message.
 */
public class Lab09TaskA2 {

    public static void main (String[] args) {

        Printer.print("\nThe program calculate count of even digits in natural number.\n");
        //Statics method which returns int number from input:
        int number = UserInput.input("\nInput number: ");

        //Int default constructor:
        CalenderWorker calenderWorker = new CalenderWorker();
        String answer = calenderWorker.getNumberOfDaysInMonth(number);

        //Print to the console count of even number:
        Printer.print("\nNumber of days in month for " + number + " is:");
        Printer.print("\n\t" + answer);

    }
}
