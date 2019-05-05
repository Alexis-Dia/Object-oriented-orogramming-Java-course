package by.bntu.fitr.povt.alexeyd.lab4;

import by.bntu.fitr.povt.alexeyd.lab4.triangleLogics.TriangleLogic;
import by.bntu.fitr.povt.alexeyd.lab4.triangleUtils.InputUtils;

import java.util.Scanner;

/**
 * Number of laboratory work is №4. Java Simple Operators (operations). Relational & Logical Operations. Linear Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 21.04.2019, v1.1. Number of group is 30701117.
 * Task №16. Develop a program that verifies that the sides of triangle is equals.
 */
public class Lab04Task16 {

    //Method main - entry point for programme.
    public static void main(String[] args) {

        while (true) {
            // user input
            Scanner scanner = new Scanner(System.in);

            //Getting length of side a from scanner
            double sideA = InputUtils.inputTriangleSide(scanner, "sideA");

            //Getting length of side b from scanner
            double sideB = InputUtils.inputTriangleSide(scanner, "sideB");

            //Getting length of side c from scanner
            double sideC = InputUtils.inputTriangleSide(scanner, "sideC");

            boolean isTriangle = TriangleLogic.isTriangle(sideA, sideB, sideC);
            if (isTriangle) {
                //Check condition which solve, is it triangle or not.
                boolean result = TriangleLogic.triangleHasEqualsSides(sideA, sideB, sideC);

                //Print to console length of triangle sides
                System.out.println("a = " + sideA + "; b = " + sideB + "; c = " + sideC);

                //Print to console is it triangle or not
                System.out.println("It's  " + result + " that a triangle has equals sides");

                //Exit from cycle
                break;
            } else {
                //Print to console that it is'n triangle and repeat cycle
                System.out.println("It's not a triangle, input sides again: \n");
            }
        }

    }

}