package by.bntu.fitr.povt.alexeyd.lab3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

// Number of laboratory work is 'Basics of the simplest console I / O in Java. Using Java classes and objects'
// This programme was created by Alexey Nikolaevich Druzik in 19.04.2019, v1.3. Number of group is 30701117.
// Main aim of this programme is to develop system which count and print to console full number of years lived using birthday.
public class LifeCalculator {

    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your day of birth: ");
        int birthDay = scanner.nextInt();

        System.out.print("Input your month of birth: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Input your year of birth: ");
        int birthYear = scanner.nextInt();

        // business logic (the main part of the program)
        GregorianCalendar calendar = new GregorianCalendar();

        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);
        int xDay = currentDay - birthDay;
        int xMonth = currentMonth - birthMonth;
        int xYear = currentYear - birthYear;

        int days = xDay + xMonth * 30 + xYear * 365;

        // user output (view)
        System.out.println("\nToday: " + currentDay + "." + currentMonth + "." + currentYear);

        System.out.println("\nApproximately result: you have been living for " + days + " days");
    }

}
