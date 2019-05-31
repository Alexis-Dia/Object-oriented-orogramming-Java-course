package by.bntu.fitr.povt.alexeyd.lab10.controller;

import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bucket;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Orange;
import by.bntu.fitr.povt.alexeyd.lab10.model.logic.NumberLogic;
import by.bntu.fitr.povt.alexeyd.lab10.model.logic.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab10.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab10.view.Printer;

public class Controller {

    private static final int SIZE = 100;
    private Printer printer = new Printer();
    private UserInput userInput = new UserInput();

    public void executeMainTask() {
        Bucket bucket = new Bucket("POIT30701117");

        bucket.bread = new Bread(true, 500, 1.2, true, "Borodinskiy",
                "Chilli", "Brown", "Square");
        bucket.orange = new Orange(false, 110, 0.7, 11, 0.1,
                true, "Rosso", "Elipse");
        bucket.milk = new Milk(false, 450, 2.1, 500, 3.2, 7.7,
                false, true);

        double avgBucketPrice = ShopAssistance.calculateAvgPrice(bucket);
        double avgBucketWeight = ShopAssistance.calculateAvgWeight(bucket);
        boolean prize = ShopAssistance.getPrize(bucket);

        printer.print(bucket + "");
        printer.print("\nAvg bucket price = " + avgBucketPrice);
        printer.print("\nAvg bucket weight = " + avgBucketWeight);
        printer.print(prize ? "\nYou won a prize!" : "\n");
    }

    public void executeAdditionTask() {
        printer.print("The program guesses user number from 1 to 100, using two algorithms - binary and using" +
                " random number generator.\n");

        //Statics method which returns int number from input:
        int[] arr = NumberLogic.initArr(SIZE);
        int number = userInput.input("\nInput number from 1 to 99: ");


        //Getting indexes bu using two different search-methods - by binary and by randomly
        int indexByUsingBynary = NumberLogic.binarySearch(arr, 0, SIZE, number);
        int indexByUsingRandom = NumberLogic.randomSearch(arr, SIZE, number);

        //Print results
        printer.print("indexByUsingBynary = " + indexByUsingBynary);
        printer.print("indexByUsingRandom = " + indexByUsingRandom);

    }
}
