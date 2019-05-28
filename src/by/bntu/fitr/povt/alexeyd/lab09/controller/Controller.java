package by.bntu.fitr.povt.alexeyd.lab09.controller;

import by.bntu.fitr.povt.alexeyd.lab09.dto.Border;
import by.bntu.fitr.povt.alexeyd.lab09.model.*;
import by.bntu.fitr.povt.alexeyd.lab09.util.DialogUserInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.EvenUserInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.calendarInputs.DayInput;
import by.bntu.fitr.povt.alexeyd.lab09.util.calendarInputs.MonthInput;
import by.bntu.fitr.povt.alexeyd.lab09.view.Printer;

public class Controller {

    private static final int INIT_VALUE = 0;
    private static final int NUMBER_OF_TASK = 10;
    public static final String CONGRATULATIONS = "Congratulations!!!!";

    private Printer printer = new Printer();

    private CalenderWorker calenderWorker = new CalenderWorker();

    private RowGenerator rowGenerator = new RowGenerator();

    private NumberGuesser numberGuesser = new NumberGuesser();

    private UserInput input = new UserInput();

    public void executeTask1 () {

        printer.print("\nThe program calculates number of date in month.\n");
        //Statics method which returns int number from input:
        int number = UserInput.input("\nInput number: ");

        //Int default constructor:
        String numbersOfDays = calenderWorker.getNumberOfDaysInMonth(number);

        //Print to the console count of even number:
        printer.print("\nNumber of days in month for " + number + " is:");
        printer.print("\n\t" + numbersOfDays);
    }

    public void executeTask2 () {
        printer.print("\nThe program getResult sign of zodiac by day and month.\n");
        //Statics method which returns int number of month:
        int month = MonthInput.input("\nInput month: ");

        //Statics method which returns int number of day:
        int day = DayInput.input("\nInput day: ");

        //Int default constructor by birthDay:
        Border birthDay = new Border(month, day);
        String answer = calenderWorker.getZodiacSign(birthDay);

        //Print to the console count of even number:
        printer.print("\nSign of zodiac for month= " + month + " and day= " + day + " is:");
        printer.print("\n\t" + answer);
    }

    public void executeTask3 () {
        printer.print("\nThe program calculates happy numbers.\n");

        boolean answer;
        int rank;
        int results;
        do {
            //Statics method which returns int number from input:
            rank = EvenUserInput.input("Input even number from 1 to 9: ");

            //Int default constructor by birthDay:
            results = NumberWorker.calculateHappyNumbers(rank);

            //Print to the console resulting ticket:
            printer.print("*** Counting Happy Tickets ***");
            printer.print("Input count of digit in bus ticket number: " + rank);
            printer.print("Count of happy tickets: " + results);
            printer.print("");

            answer = DialogUserInput.input("Do you want to continue running program? (Yes or No)");
        } while (answer);
    }

    public void executeTask4 () {
        printer.print("\nThe program getResult count of even digits in natural number.\n");

        //Int default constructor by birthDay:
        int[] results = PlayWorker.playHeadsOrTails();

        //Print to the console count of even number:
        printer.print("\nNumber of heads = " + results[0] + " and number of tails = " + results[1]);
        printer.print("\n\t");
    }

    public void executeTask5 () {
        printer.print("\nThe program checks answers.");
        printer.print("\nInput the answer after the example and press <Enter>.");

        int count = INIT_VALUE;
        int numberOfRightAnswers = INIT_VALUE;
        boolean runTest;
        do {
            //Increase count in each cycle
            ++count;

            while (count <= NUMBER_OF_TASK) {
                count++;

                //Method returns right anser
                int[] rightAnswer = TaskWorker.taskGenerator();
                int mul = rightAnswer[0] * rightAnswer[1];
                printer.print(rightAnswer[0] + " x " + rightAnswer[1] + " = ");

                //Statics method which returns int number from input:
                int answer = UserInput.input("");

                if (mul != answer)
                    printer.print("You made a mistake! " + rightAnswer[0] + " x " + rightAnswer[1] + " != " +  answer);
                else
                    ++numberOfRightAnswers;
            }
            String report = ScoreCalculator.getResult(NUMBER_OF_TASK, numberOfRightAnswers);
            printer.print("Right answers: " + numberOfRightAnswers + " of 10");
            printer.print("Your mark: " + numberOfRightAnswers + " (" + report + ")");
            runTest = DialogUserInput.input("Do you want to continue running program? (Yes or No)");
            count = INIT_VALUE;
            numberOfRightAnswers = INIT_VALUE;
        } while (runTest);
    }

    public void executeTask6 () {
        System.out.println("Input left and right:");
        int left = UserInput.input("Input number: ");
        int right = UserInput.input("Input number: ");
        int random = rowGenerator.generate(left, right);

        boolean flag = false;
        while (!flag) {
            int userAnswer = input.input(("Input number: "));
            String result = numberGuesser.validateResult(random, userAnswer);
            printer.print(result);
            if (result == CONGRATULATIONS) {
                flag = true;
            }
        }
    }
}
