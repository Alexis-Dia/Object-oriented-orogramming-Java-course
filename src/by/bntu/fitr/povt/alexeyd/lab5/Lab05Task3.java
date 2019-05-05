package by.bntu.fitr.povt.alexeyd.lab5;

import by.bntu.fitr.povt.alexeyd.lab5.inputUtils.InputUtils;
import by.bntu.fitr.povt.alexeyd.lab5.numberLogic.NumberLogic;

import java.util.Scanner;

/**
 * Number of laboratory work is №5. Java Simple Operators (operations). Java Simple Operators (operations).
 * Arithmetical Operations. Linear Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 21.04.2019, v1.1. Number of group is 30701117.
 * Task №3. Develop a program that count arithmetic and geometric average of sum of digits in number.
 */
public class Lab05Task3 {

    //Method main - entry point for programme.
    public static void main(String[] args) {
        //Create scanner link and initialize it.
        Scanner scanner = new Scanner(System.in);

        //Getting number from input
        int number = InputUtils.getNumberFromInput(scanner);

        //Check condition which solve, is it triangle or not.
        double averageArithmetic = NumberLogic.getAverageArithmetic(number);
        double averageGeometric = NumberLogic.getAverageGeometric(number);

        //Print result to the console
        System.out.println("Arithmetic average = " + averageArithmetic + " of sum of digit in the number = " + number);
        System.out.println("Geometric average = " + averageGeometric + " of sum of digit in the number = " + number);
    }
}