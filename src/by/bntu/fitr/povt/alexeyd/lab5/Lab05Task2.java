package by.bntu.fitr.povt.alexeyd.lab5;

import by.bntu.fitr.povt.alexeyd.lab5.inputUtils.InputUtils;
import by.bntu.fitr.povt.alexeyd.lab5.numberLogic.NumberLogic;

import java.util.Scanner;

/**
 *Number of laboratory work is №5. Java Simple Operators (operations). Java Simple Operators (operations).
 * Arithmetical Operations. Linear Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 23.04.2019, v1.1. Number of group is 30701117.
 * Task №2. Develop a program that count sum of digits in number.
 */
    public class Lab05Task2 {

        //Method main - entry point for programme.
        public static void main(String[] args) {
            //Create scanner link and initialize it.
            Scanner scanner = new Scanner(System.in);

            //Getting number from input
            int number = InputUtils.getNumberFromInput(scanner);

            //Check condition which solve, is it triangle or not.
            int result = NumberLogic.getSumOfAllDigits(number);

            System.out.println("Sum of numbers of " + number + " digit =  " + result);
        }
}
