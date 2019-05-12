package by.bntu.fitr.povt.alexeyd.lab08.controller;

import by.bntu.fitr.povt.alexeyd.lab08.model.logic.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab08.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab08.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 11.05.2019, v1.1. Number of group is 30701117.
 * Task №D-5. Set a natural number. Each time the largest number used in the recording of a given number is duplicated.
 * For example, in the number 349291, the maximum number is 9, therefore, we get the resultant number 34992991.
 */
public class Lab08TaskD5 {

    public static void main (String[] args) {

        Printer.print("\nThe program dublicates max digit in natural number.\n");
        //Statics method which returns int number from input:
        long number = UserInput.input("\nInput number: ");

        int maxNumber = NumberWorker.getMaxNumber(number);
        long increasedNumber = NumberWorker.getIncreasedNumber(number, maxNumber);

        //Print to the console count of even number:
        Printer.print("\nResult:");
        Printer.print("\nOriginate number =  " + maxNumber);
        Printer.print("\nIncreased number =  " + increasedNumber);
    }
}
