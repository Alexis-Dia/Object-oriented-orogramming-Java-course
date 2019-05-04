package by.bntu.fitr.povt.alexeyd.lab7.controller;

import by.bntu.fitr.povt.alexeyd.lab7.view.Printer;
import by.bntu.fitr.povt.alexeyd.lab7.model.logic.HeadsCalculator;
import by.bntu.fitr.povt.alexeyd.lab7.util.UserInput;

public class Lab07Task1 {

    public static void main(String[] args) {

        //Statics method which returns double number from input:
        double age = UserInput.input("Input age:");

        //Methods which take two parameters - sides of rectangle and returns perimeter and area:
        double s = HeadsCalculator.calculateHeads(age);

        //Print to the console finaly results:
        Printer.print("Number of heads with age = " + age + ": ");
        Printer.print("Age = " + age);    }
}
