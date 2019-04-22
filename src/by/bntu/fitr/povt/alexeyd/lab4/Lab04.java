package by.bntu.fitr.povt.alexeyd.lab4;

import java.util.Scanner;

import static by.bntu.fitr.povt.alexeyd.lab4.InputUtils.inputTriangleSide;

// Number of laboratory work is №4. Java Simple Operators (operations). Relational & Logical Operations. Linear Algorithms.
// This programme was created by Alexey Nikolaevich Druzik in 21.04.2019, v1.1. Number of group is 30701117.
// Task №15. Develop a program that verifies that the numbers a, b, and c are really sides of a triangle.
public class Lab04 {

    //Method main - entry point for programme.
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);

        //Getting length of side a from scanner
        double sideA = inputTriangleSide(scanner, "sideA");

        //Getting length of side b from scanner
        double sideB = inputTriangleSide(scanner, "sideB");

        //Getting length of side c from scanner
        double sideC = inputTriangleSide(scanner, "sideC");

        //Check condition which solve, is it triangle or not.
        boolean result = TriangleLogic.isTriangle(sideA, sideB, sideC);

        //Print to console length of triangle sides
        System.out.println("a = " + sideA + "; b = " + sideB + "; c = " + sideC);

        //Print to console is it triangle or not
        System.out.println("It's  " + result + " that it's a triangle");
    }

}
