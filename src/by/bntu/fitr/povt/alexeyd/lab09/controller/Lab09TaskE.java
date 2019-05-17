package by.bntu.fitr.povt.alexeyd.lab09.controller;

import by.bntu.fitr.povt.alexeyd.lab09.logic.ReportWorker;
import by.bntu.fitr.povt.alexeyd.lab09.logic.TaskWorker;
import by.bntu.fitr.povt.alexeyd.lab09.util.DialogUserInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab09.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 14.05.2019, v1.1. Number of group is 30701117.
 * Task №E. Write a program to test the ability to add and subtract numbers or knowledge tests of the multiplication
 * table of numbers from 1 to N ("Multiplication table"). The program should display M examples and rate it:
 * for all the correct ones.
 */
public class Lab09TaskE {

    private static final int INIT_VALUE = 0;
    private static final int NUMBER_OF_TASK = 10;

    public static void main (String[] args) {

        Printer.print("\nThe program calculates happy numbers.");
        Printer.print("\nInput the answer after the example and press <Enter>.");

        int count = INIT_VALUE;
        int numberOfRightAnswers = INIT_VALUE;
        boolean runTest = false;
        do {
            //Increase count in each cycle
            ++count;

            while (count <= NUMBER_OF_TASK) {
                count++;

                //Method returns right anser
                int[] rightAnswer = TaskWorker.taskGenerator();
                int mul = rightAnswer[0] * rightAnswer[1];
                Printer.print(rightAnswer[0] + " x " + rightAnswer[1] + " = ");

                //Statics method which returns int number from input:
                int answer = UserInput.input("");
                //Printer.print("" + answer);

                if (mul != answer)
                    Printer.print("You made a mistake! " + rightAnswer[0] + " x " + rightAnswer[1] + " != " +  answer);
                else
                    ++numberOfRightAnswers;
            }
            String report = ReportWorker.printReport(NUMBER_OF_TASK, numberOfRightAnswers);
            //String report = ReportWorker.printReport(NUMBER_OF_TASK, 10);
            Printer.print("Right answers: " + numberOfRightAnswers + " of 10");
            Printer.print("Your mark: " + numberOfRightAnswers + " (" + report + ")");
            runTest = DialogUserInput.input("Do you want to continue running program? (Yes or No)");
            count = INIT_VALUE;
            numberOfRightAnswers = INIT_VALUE;
        } while (runTest);

    }
}
