package by.bntu.fitr.povt.alexeyd.lab06.controller;

import by.bntu.fitr.povt.alexeyd.lab06.model.logic.RectangleCalculator;
import by.bntu.fitr.povt.alexeyd.lab06.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab06.view.Printer;

/**
 * Number of laboratory work is №6. Flow Controls. Conditional Statements.
 * This programme was created by Alexey Nikolaevich Druzik in 23.04.2019, v1.1. Number of group is 30701117.
 * Task №10. Develop a program that counts square and perimeter of rectangle.
 */
public class Lab06Task10 {
    public static void main(String[] args) {

        //Statics method which returns double number from input:
        double a = UserInput.input("Input a:");
        double b = UserInput.input("Input b:");

        //Methods which take TWO parameters - sides of rectangle and returns perimeter and area:
        double s = RectangleCalculator.calculateArea(a, b);
        double p = RectangleCalculator.calculatePerimeter(a, b);

        //Print to the console finaly results:
        Printer.print("Square with a = " + a + " and b = " + b + ": ");
        Printer.print("S = " + s);
        Printer.print("P = " + p);
    }

}
