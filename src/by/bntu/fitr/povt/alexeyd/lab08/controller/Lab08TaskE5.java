package by.bntu.fitr.povt.alexeyd.lab08.controller;

import by.bntu.fitr.povt.alexeyd.lab08.model.logic.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab08.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab08.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 11.05.2019, v1.1. Number of group is 30701117.
 * Task №E-5. Find the simple number of the order number. For reference: prime numbers are natural numbers
 * (positive integers) that have exactly two different natural dividers - a unit and oneself
  */
public class Lab08TaskE5 {

    public static void main (String[] args) {

        Printer.print("\nThe program calculate prime number by index.\n");
        //Statics method which returns int number from input:
        long index = UserInput.input("\nInput index of prime number: ");

        //Getting prime number by index
        long primeNumber = NumberWorker.getPrimeNumberByIndex(index);

        //Print to the console count of even number:
        Printer.print("\nResult:");
        Printer.print("\n\tPrime number = " + primeNumber + ", for index = " + index);
    }
}
