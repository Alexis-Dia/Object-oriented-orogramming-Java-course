package by.bntu.fitr.povt.alexeyd.lab7.controller;

import by.bntu.fitr.povt.alexeyd.lab7.view.Printer;
import by.bntu.fitr.povt.alexeyd.lab7.model.logic.HeadsCalculator;
import by.bntu.fitr.povt.alexeyd.lab7.util.UserInput;

/**
 * Number of laboratory work is №7. Java Basic Syntax. Conditional Statements. Branching Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 01.05.2019, v1.1. Number of group is 30701117.
 * Task №1. Develop a program that counts dragon number of heads.
 */
public class Lab07Task1 {

    public static void main(String[] args) {

        //Statics method which returns double number from input:
        int age = UserInput.input("Input age:");

        //Methods which take TWO parameters - sides of rectangle and returns perimeter and area:
        int numberOfHeads = HeadsCalculator.calculateHeads(age);

        //Print to the console finaly results:
        Printer.print("Number of heads with age = " + age + " : ");
        Printer.print("" + numberOfHeads);
    }
}
