package by.bntu.fitr.povt.alexeyd.lab06.controller;

import by.bntu.fitr.povt.alexeyd.lab06.model.logic.CircleCalculator;
import by.bntu.fitr.povt.alexeyd.lab06.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab06.view.Printer;

/**
 * Number of laboratory work is №6. Flow Controls. Conditional Statements.
 * This programme was created by Alexey Nikolaevich Druzik in 23.04.2019, v1.1. Number of group is 30701117.
 * Task №10. Develop a program that counts length and perimeter of circle.
 */
public class Lab06Task11 {
    public static void main(String[] args) {

        //Statics method which returns double number from input:
        double r = UserInput.input("Input rsdius:");

        //Methods which take one parameter - radius of circle and returns perimeter and lenth:
        double l = CircleCalculator.calculateLength(r);
        double s = CircleCalculator.calculateArea(r);

        //Print to the console finaly results:
        Printer.print("Circle with r = " + r + ": ");
        Printer.print("L = " + l);
        Printer.print("S = " + s);
    }

}
