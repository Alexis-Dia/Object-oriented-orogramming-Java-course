package by.bntu.fitr.povt.alexeyd.lab08.controller;

import by.bntu.fitr.povt.alexeyd.lab08.model.logic.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab08.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab08.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 11.05.2019, v1.1. Number of group is 30701117.
 * Task №B-5. Develop a program that checks that even (or odd) prevail among the digits of a given natural number.
 */
public class Lab08TaskB5 {

    public static void main (String[] args) {

        Printer.print("\nThe program calculate quantity and sum of number digits.\n");
        //Statics method which returns int number from input:
        long number = UserInput.input("\nInput number: ");

        boolean evenPrevails = NumberWorker.checkEvenPrevails(number);

        //Print to the console count of even number:
        Printer.print("\nResult:");
        Printer.print("\n\t Even prevail between odd number is: " + evenPrevails);

    }
}
