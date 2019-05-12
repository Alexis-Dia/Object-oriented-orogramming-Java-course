package by.bntu.fitr.povt.alexeyd.lab08.controller;

import by.bntu.fitr.povt.alexeyd.lab08.model.logic.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab08.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab08.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 11.05.2019, v1.1. Number of group is 30701117.
 * Task №A-5. Write a program that counts the number of only even (or odd) digits of a given natural number.
 */
public class Lab08TaskA5 {

    public static void main (String[] args) {

        Printer.print("\nThe program calculate count of even digits in natural number.\n");
        //Statics method which returns int number from input:
        long number = UserInput.input("\nInput number: ");

        int countOfEvenNumber = NumberWorker.countOfEvenNumber(number);

        //Print to the console count of even number:
        Printer.print("\nResult:");
        Printer.print("\n\t Count of even number = " + countOfEvenNumber);

    }
}
