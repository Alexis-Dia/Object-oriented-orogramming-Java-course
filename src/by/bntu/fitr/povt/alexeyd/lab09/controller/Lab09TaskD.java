package by.bntu.fitr.povt.alexeyd.lab09.controller;

import by.bntu.fitr.povt.alexeyd.lab09.logic.PlayWorker;
import by.bntu.fitr.povt.alexeyd.lab09.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 14.05.2019, v1.1. Number of group is 30701117.
 * Task №D. Write a program "Heads or Tails", which would conditionally "Flip" a coin, for example, 1000 times,
 * and reported how many times it fell Tails, and how much - tails.
 */
public class Lab09TaskD {

    public static void main (String[] args) {

        Printer.print("\nThe program calculate count of even digits in natural number.\n");

        //Int default constructor by birthDay:
        int[] results = PlayWorker.playHeadsOrTails();

        //Print to the console count of even number:
        Printer.print("\nNumber of heads = " + results[0] + " and number of tails = " + results[1]);
        Printer.print("\n\t");
    }
}
