package by.bntu.fitr.povt.alexeyd.lab09.controller;

import by.bntu.fitr.povt.alexeyd.lab09.logic.Border;
import by.bntu.fitr.povt.alexeyd.lab09.logic.CalenderWorker;
import by.bntu.fitr.povt.alexeyd.lab09.util.calendar.DayInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.calendar.MonthInput;
import by.bntu.fitr.povt.alexeyd.lab09.view.Printer;

/**
 * Number of laboratory work is №8. Java Basic Syntax. Loop Statements. Iteration Algorithms.
 * This programme was created by Alexey Nikolaevich Druzik in 14.05.2019, v1.1. Number of group is 30701117.
 * Task №B-1. Given two integers, corresponding to the day and month and determine the correct date.
 * Write a program that displays the zodiac sign corresponding to this date: “Aquarius” (20.1–18.2), “Pisces” (19.2–20.3),
 * “Aries” (21.3-* 19.4), Taurus (20.4-20.5), Gemini (21.5-21.6), Cancer (22.6-22.7), Leo (23.7- * 22.8),
 * Virgo (23.8-22.9), * Libra (23.9-22.10), Scorpio (23.10-22.11), Sagittarius (23.11-21.12) and Capricorn (22.12-19.1).
 */
public class Lab09TaskB1 {

    public static void main (String[] args) {

        Printer.print("\nThe program calculate count of even digits in natural number.\n");
        //Statics method which returns int number of month:
        int month = MonthInput.input("\nInput month: ");

        //Statics method which returns int number of day:
        int day = DayInput.input("\nInput day: ");

        //Int default constructor by birthDay:
        Border birthDay = new Border(month, day);
        CalenderWorker calenderWorker = new CalenderWorker();
        String answer = calenderWorker.getZodiacSign(birthDay);

        //Print to the console count of even number:
        Printer.print("\nSign of zodiac for month= " + month + " and day= " + day + " is:");
        Printer.print("\n\t" + answer);

    }
}
