package by.bntu.fitr.povt.alexeyd.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Java example program to calculate age from date of birth
// Works only in Java 8 and above
public class CalculateAgeJava8 {

    public static void main(String[] args) {
        System.out.print("Please enter date of birth in YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LocalDate dob = LocalDate.parse(input);
        System.out.println("Age is:" + getAge(dob));
    }

    // Returns age given the date of birth
    public static int getAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        return Period.between(dob, curDate).getYears();
    }

}
