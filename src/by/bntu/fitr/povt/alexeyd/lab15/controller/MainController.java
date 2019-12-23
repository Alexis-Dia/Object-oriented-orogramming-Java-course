package by.bntu.fitr.povt.alexeyd.lab15.controller;

import by.bntu.fitr.povt.alexeyd.lab15.factory.DataGenerator;
import by.bntu.fitr.povt.alexeyd.lab15.factory.DataStoreFactory;
import by.bntu.fitr.povt.alexeyd.lab15.factory.MyDataStoreFactory;
import by.bntu.fitr.povt.alexeyd.lab15.logic.NumberLogic;
import by.bntu.fitr.povt.alexeyd.lab15.logic.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab15.logic.VectorAssistance;
import by.bntu.fitr.povt.alexeyd.lab15.logic.comparator.ComparatorByFatAndCarbons;
import by.bntu.fitr.povt.alexeyd.lab15.logic.comparator.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab15.logic.comparator.ComparatorByShapeAndDiameter;
import by.bntu.fitr.povt.alexeyd.lab15.logic.comparator.ComparatorBySortAndFlavor;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.VectorContainer;
import by.bntu.fitr.povt.alexeyd.lab15.util.SubGroup;
import by.bntu.fitr.povt.alexeyd.lab15.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab15.view.ConsolePrinter;
import by.bntu.fitr.povt.alexeyd.lab15.view.MyPrintFactory;
import by.bntu.fitr.povt.alexeyd.lab15.view.PrintFactory;
import by.bntu.fitr.povt.alexeyd.lab15.view.Printer;

import java.util.*;

public class MainController {

    private static final String COMPARE_BY_FAT_AND_CARBONS = "CompareByFatAndCarbons";
    private static final String COMPARE_BY_SORT_AND_FLAVOR = "CompareBySortAndFlavor";
    private static final String COMPARE_BY_SHAPE_AND_DIAMETER = "CompareByShapeAndDiameter";
    private static final Map<String, Comparator> STRATEGIES_MAP;
    private static final String SRC_RESOURCES_PATH = "src/resources/bread.txt";

    static {
        STRATEGIES_MAP = new HashMap<>();
        STRATEGIES_MAP.put(COMPARE_BY_FAT_AND_CARBONS, new ComparatorByFatAndCarbons());
        STRATEGIES_MAP.put(COMPARE_BY_SORT_AND_FLAVOR, new ComparatorBySortAndFlavor());
        STRATEGIES_MAP.put(COMPARE_BY_SHAPE_AND_DIAMETER, new ComparatorByShapeAndDiameter());
    }

    private static final int SIZE = 100;
    private ConsolePrinter printer = new ConsolePrinter();
    private UserInput userInput = new UserInput();

    public void executeMainTask() {

        DataStoreFactory dataStoreFactory = new MyDataStoreFactory();
        DataGenerator dataGenerator = dataStoreFactory.orderData(MyDataStoreFactory.RANDOM);
        String data = dataGenerator.read(SRC_RESOURCES_PATH);
        String[][] rowArr = ShopAssistance.serializeData(data);

        List<Product> products = ShopAssistance.parseProduct(rowArr);

        System.out.println("Found index: " + products.get(SubGroup.FRUIT.getGroupCode()));
        //products.remove(3);
        double avgBucketPrice = ShopAssistance.calculateAvgPrice(products);
        double avgBucketWeight = ShopAssistance.calculateAvgWeight(products);
        boolean prize = ShopAssistance.getPrize(products);

        //Collections.sort(products);
        Collections.sort(products, new ComparatorByPriceAndId());

        PrintFactory printFactory = new MyPrintFactory();
        Printer printer = printFactory.order(MyPrintFactory.CONSOLE);

        printer.write("\nAvg bucket price = " + avgBucketPrice);
        printer.write("\nAvg bucket weight = " + avgBucketWeight);
        printer.write(prize ? "\nYou won a prize!\n" : "\n");
        printer.write(products.toString());
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
        printer.write(arr);
        printer.write("");
        printer.write(modifiedArr);

    }

    public void executeAdditionTask() {
        printer.write("The program guesses user number from 1 to 100, using two algorithms - binary and using" +
            " random number generator.\n");

        //Statics method which returns int number from input:
        int[] arr = NumberLogic.initArr(SIZE);
        int number = userInput.inputNumber("\nInput number from 1 to 99: ");


        //Getting indexes bu using two different search-methods - by binary and by randomly
        int indexByUsingBynary = NumberLogic.binarySearch(arr, 0, SIZE, number);
        int indexByUsingRandom = NumberLogic.randomSearch(arr, SIZE, number);

        //Print results
        printer.write("indexByUsingBynary = " + indexByUsingBynary);
        printer.write("indexByUsingRandom = " + indexByUsingRandom);

    }
}
