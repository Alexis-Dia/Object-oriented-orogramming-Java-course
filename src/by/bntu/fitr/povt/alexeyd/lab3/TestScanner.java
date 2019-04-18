package by.bntu.fitr.povt.alexeyd.lab3;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // reads byte value
        byte byteValue = scanner.nextByte();

        // reads short value
        short shortValue = scanner.nextShort();

        // reads int value
        int intValue = scanner.nextInt();

        // reads long value
        long longValue = scanner.nextLong();

        // reads float value
        float floatValue = scanner.nextFloat();

        // reads double value
        double doubleValue = scanner.nextDouble();

        // reads boolean value
        boolean booleanValue = scanner.nextBoolean();

        // reads line before pressing Enter
        String line = scanner.nextLine();
        System.out.println(line);

        // reads word before any whitespace character
        String word = scanner.next();
        System.out.println(word);

        // reads char value
        char charValue = scanner.next().charAt(0);
        System.out.println(charValue);

        scanner.close();
    }

}
