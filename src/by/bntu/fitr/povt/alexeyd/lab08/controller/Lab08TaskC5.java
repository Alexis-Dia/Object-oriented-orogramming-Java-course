package by.bntu.fitr.povt.alexeyd.lab08.controller;

import by.bntu.fitr.povt.alexeyd.lab08.model.logic.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab08.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab08.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 11.05.2019, v1.1. Number of group is 30701117.
 * Task №C-5. Develop a program that reverses a given number. With this, if the number is negative,
 * then the result of the reversal should also be a negative number.
 */
public class Lab08TaskC5 {

    public static void main (String[] args) {

        Printer.print("\nThe program reverse natural number.\n");
        //Statics method which returns int number from input:
        long number = UserInput.input("\nInput number: ");

        long reversedNumber = NumberWorker.getReversedNumber(number);

        //Print to the console count of even number:
        Printer.print("\nResult:");
        Printer.print("\nOriginate number =  " + number);
        Printer.print("\n\tReversed number =  " + reversedNumber);

    }
}
