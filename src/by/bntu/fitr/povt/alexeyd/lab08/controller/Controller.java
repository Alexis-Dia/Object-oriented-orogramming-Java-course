package by.bntu.fitr.povt.alexeyd.lab08.controller;

import by.bntu.fitr.povt.alexeyd.lab08.model.NumberWorker;
import by.bntu.fitr.povt.alexeyd.lab08.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab08.view.Printer;

public class Controller {

    private Printer printer = new Printer();

    private NumberWorker numberWorker = new NumberWorker();

    private UserInput userInput = new UserInput();

    public void executeTask1 () {
        printer.print("\nThe program getResult count of even digits in natural number.\n");
        //Statics method which returns int number from input:
        long number = userInput.input("\nInput number: ");

        int countOfEvenNumber = numberWorker.countOfEvenNumber(number);

        //Print to the console count of even number:
        printer.print("\nResult:");
        printer.print("\n\t Count of even number = " + countOfEvenNumber);
    }

    public void executeTask2 () {

        printer.print("\nThe program checks if even digits prevails between odd in natural number.\n");
        //Statics method which returns int number from input:
        long number = userInput.input("\nInput number: ");

        boolean evenPrevails = numberWorker.checkEvenPrevails(number);

        //Print to the console count of even number:
        printer.print("\nResult:");
        printer.print("\n\t Even prevail between odd number is: " + evenPrevails);
    }

    public void executeTask3 () {

        printer.print("\nThe program reverse natural number.\n");
        //Statics method which returns int number from input:
        long number = userInput.input("\nInput number: ");

        long reversedNumber = numberWorker.getReversedNumber(number);

        //Print to the console count of even number:
        printer.print("\nResult:");
        printer.print("\nOriginate number =  " + number);
        printer.print("\n\tReversed number =  " + reversedNumber);

    }

    public void executeTask4 () {
        printer.print("\nThe program dublicates max digit in natural number.\n");
        //Statics method which returns int number from input:
        long number = userInput.input("\nInput number: ");

        int maxNumber = numberWorker.getMaxNumber(number);
        long increasedNumber = numberWorker.getIncreasedNumber(number, maxNumber);

        //Print to the console count of even number:
        printer.print("\nResult:");
        printer.print("\nOriginate number =  " + maxNumber);
        printer.print("\nIncreased number =  " + increasedNumber);
    }

    public void executeTask5 () {
        printer.print("\nThe program getResult prime number by index.\n");
        //Statics method which returns int number from input:
        long index = userInput.input("\nInput index of prime number: ");

        //Getting prime number by index
        long primeNumber = numberWorker.getPrimeNumberByIndex(index);

        //Print to the console count of even number:
        printer.print("\nResult:");
        printer.print("\n\tPrime number = " + primeNumber + ", for index = " + index);
    }
}
