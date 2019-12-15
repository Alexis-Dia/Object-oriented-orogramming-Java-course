package by.bntu.fitr.povt.alexeyd.lab13.controller;

import by.bntu.fitr.povt.alexeyd.lab13.logic.comparators.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.*;
import by.bntu.fitr.povt.alexeyd.lab13.model.logic.NumberLogic;
import by.bntu.fitr.povt.alexeyd.lab13.model.logic.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab13.model.logic.VectorAssistance;
import by.bntu.fitr.povt.alexeyd.lab13.util.SubGroup;
import by.bntu.fitr.povt.alexeyd.lab13.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab13.view.Printer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainController {

    private static final int SIZE = 100;
    private Printer printer = new Printer();
    private UserInput userInput = new UserInput();

    public void executeMainTask() {
        List<Product> products = new ArrayList();

        products.add(new Bread(true, 500, 1.2, true, "Borodinskiy",
            "Chilli", "Brown", "Square", 1276234));
        products.add(new Orange(false, 110, 0.7, 11, 0.1,
            true, "Rosso", "Elipse", 73483438));
        products.add(new Milk(false, 450, 2.3, 500, 3.2, 7.7,
            false, true, 32635625));
        products.add(new Milk(false, 450, 2.3, 500, 5.2, 9.7,
            false, true, 32635624));
        System.out.println("Found index: " + products.get(SubGroup.FRUIT.getGroupCode()));
        //products.remove(3);
        double avgBucketPrice = ShopAssistance.calculateAvgPrice(products);
        double avgBucketWeight = ShopAssistance.calculateAvgWeight(products);
        boolean prize = ShopAssistance.getPrize(products);

        //Collections.sort(products);
        Collections.sort(products, new ComparatorByPriceAndId());
        printer.print("\nAvg bucket price = " + avgBucketPrice);
        printer.print("\nAvg bucket weight = " + avgBucketWeight);
        printer.print(prize ? "\nYou won a prize!\n" : "\n");
        printer.print(products);
    }

    public void executeAdditionExamTask() {
        VectorContainer vectorContainer = new VectorContainer("SuperVector");
        vectorContainer.addElement(3);
        vectorContainer.addElement(2);
        vectorContainer.addElement(7);
        vectorContainer.addElement(8);
        vectorContainer.addElement(1);
        vectorContainer.addElement(1);

        int[] arr = vectorContainer.getContainer();
        int[] modifiedArr = VectorAssistance.getModifiedArray(vectorContainer);
        printer.print(arr);
        printer.print("");
        printer.print(modifiedArr);

    }

    public void executeAdditionTask() {
        printer.print("The program guesses user number from 1 to 100, using two algorithms - binary and using" +
            " random number generator.\n");

        //Statics method which returns int number from input:
        int[] arr = NumberLogic.initArr(SIZE);
        int number = userInput.inputNumber("\nInput number from 1 to 99: ");


        //Getting indexes bu using two different search-methods - by binary and by randomly
        int indexByUsingBynary = NumberLogic.binarySearch(arr, 0, SIZE, number);
        int indexByUsingRandom = NumberLogic.randomSearch(arr, SIZE, number);

        //Print results
        printer.print("indexByUsingBynary = " + indexByUsingBynary);
        printer.print("indexByUsingRandom = " + indexByUsingRandom);

    }
}
