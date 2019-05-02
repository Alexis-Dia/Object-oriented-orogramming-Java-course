package by.bntu.fitr.povt.alexeyd.lab06.controller;

import by.bntu.fitr.povt.alexeyd.lab06.model.logic.RectangleCalculator;
import by.bntu.fitr.povt.alexeyd.lab06.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab06.view.Printer;

public class Lab06Task10 {
    public static void main(String[] args) {

        //Statics method which returns double number from input:
        double a = UserInput.input("Input a:");
        double b = UserInput.input("Input b:");

        //Methods which take two parameters - sides of rectangle and returns perimeter and area:
        double s = RectangleCalculator.calculateArea(a, b);
        double p = RectangleCalculator.calculatePerimeter(a, b);

        //Print to the console finaly results:
        Printer.print("Square with a = " + a + " and b = " + b + ": ");
        Printer.print("S = " + s);
        Printer.print("P = " + p);
    }

}
