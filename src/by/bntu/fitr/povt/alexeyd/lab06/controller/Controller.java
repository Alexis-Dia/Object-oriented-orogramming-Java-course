package by.bntu.fitr.povt.alexeyd.lab06.controller;

import by.bntu.fitr.povt.alexeyd.lab06.model.CircleCalculator;
import by.bntu.fitr.povt.alexeyd.lab06.model.RectangleCalculator;
import by.bntu.fitr.povt.alexeyd.lab06.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab06.view.Printer;

public class Controller {

    public void executeTask10 () {

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

    public void executeTask11 () {

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
