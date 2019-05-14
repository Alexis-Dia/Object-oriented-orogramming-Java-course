package by.bntu.fitr.povt.alexeyd.lab09.controller;

import by.bntu.fitr.povt.alexeyd.lab09.logic.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab09.util.DialogUserInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.EvenUserInput;
import by.bntu.fitr.povt.alexeyd.lab09.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 14.05.2019, v1.1. Number of group is 30701117.
 * Task №C. The bus number, for example, is a six-digit number (the first ticket
 * 000000, the second - 000001, etc.). Write a program that organizes a dialogue with the user and counts the number of
 * all "happy" tickets (a "happy" ticket is one whose sum is equal to the sum of the second half of the numbers.
 */
public class Lab09TaskC {

    public static void main (String[] args) {

        Printer.print("\nThe program calculates happy numbers.\n");

        boolean answer;
        int rank;
        int results;
        do {
            //Statics method which returns int number from input:
            rank = EvenUserInput.input("Input even number: ");

            //Int default constructor by birthDay:
            results = NumberWorker.calculateHappyNumbers(rank);

            //Print to the console resulting ticket:
            Printer.print("*** Counting Happy Tickets ***");
            Printer.print("Input count of digit in bus ticket number: " + rank);
            Printer.print("Count of happy tickets: " + results);
            Printer.print("");

            answer = DialogUserInput.input("Do you want to continue running program? (Yes or No)");
        } while (answer);

    }
}
