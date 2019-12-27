package by.bntu.fitr.povt.alexeyd.lab16.controller;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.factory.DataGenerator;
import by.bntu.fitr.povt.alexeyd.lab16.factory.DataStoreFactory;
import by.bntu.fitr.povt.alexeyd.lab16.factory.MyDataStoreFactory;
import by.bntu.fitr.povt.alexeyd.lab16.factory.decorator.SimpleInputDecorator;
import by.bntu.fitr.povt.alexeyd.lab16.utils.Constant;
import by.bntu.fitr.povt.alexeyd.lab16.utils.InputUtil;
import by.bntu.fitr.povt.alexeyd.lab16.utils.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab16.utils.SubGroup;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.ComparatorByFatAndCarbons;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.ComparatorByShapeAndDiameter;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.ComparatorBySortAndFlavor;
import by.bntu.fitr.povt.alexeyd.lab16.view.MyPrintFactory;
import by.bntu.fitr.povt.alexeyd.lab16.view.PrintFactory;
import by.bntu.fitr.povt.alexeyd.lab16.view.Printer;
import by.bntu.fitr.povt.alexeyd.lab16.view.decorator.UpperCaseOutputDecorator;

import java.util.*;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.BINARY_SERIALIZABLE;
import static by.bntu.fitr.povt.alexeyd.lab16.utils.Constant.SRC_RESOURCES_INPUT_AUTOSERIALIZABLE_BINARY_PATH;

public class MainController {

    private static final String COMPARE_BY_FAT_AND_CARBONS = "CompareByFatAndCarbons";
    private static final String COMPARE_BY_SORT_AND_FLAVOR = "CompareBySortAndFlavor";
    private static final String COMPARE_BY_SHAPE_AND_DIAMETER = "CompareByShapeAndDiameter";
    private static final Map<String, Comparator> STRATEGIES_MAP;

    static {
        STRATEGIES_MAP = new HashMap<>();
        STRATEGIES_MAP.put(COMPARE_BY_FAT_AND_CARBONS, new ComparatorByFatAndCarbons());
        STRATEGIES_MAP.put(COMPARE_BY_SORT_AND_FLAVOR, new ComparatorBySortAndFlavor());
        STRATEGIES_MAP.put(COMPARE_BY_SHAPE_AND_DIAMETER, new ComparatorByShapeAndDiameter());
    }

    public void executeMainTask() {

        DataStoreFactory dataStoreFactory = new MyDataStoreFactory();
        DataGenerator dataGenerator = dataStoreFactory.orderData(BINARY_SERIALIZABLE);

        /*Input decorator pattern in action*/
        dataGenerator = new SimpleInputDecorator(dataGenerator);
        List<Product> products = dataGenerator.read();

        InputUtil.write(SRC_RESOURCES_INPUT_AUTOSERIALIZABLE_BINARY_PATH, products);

        //products.remove(3);
        double avgBucketPrice = ShopAssistance.calculateAvgPrice(products);
        double avgBucketWeight = ShopAssistance.calculateAvgWeight(products);
        boolean prize = ShopAssistance.getPrize(products);

        /*Strategy pattern in action*//*
/*        Bucket bucket = new MilkBucket();
        bucket.addProduct(new Milk(false, 450, 0.3, 500, 1.2, 7.7,
            false, true, 32635625));
        bucket.addProduct(new Milk(false, 450, 1.2, 500, 0.2, 0.7,
            false, true, 32635624));
        bucket.addProduct(new Milk(false, 450, 1.1, 500, 2.1, 0.1,
            false, true, 32635621));
        bucket.setComparator(STRATEGIES_MAP.get(COMPARE_BY_FAT_AND_CARBONS));
        bucket.performSorting();
        products = ((MilkBucket) bucket).getAll();*/

        //Collections.sort(products);
        Collections.sort(products, new ComparatorByPriceAndId());

        PrintFactory printFactory = new MyPrintFactory();
        Printer printer = printFactory.order(Constant.TEXT);
        /*Output decorator pattern in action*/
        printer = new UpperCaseOutputDecorator(printer);

        printer.write("Found index: " + products.get(SubGroup.FRUIT.getGroupCode()));
        printer.write("\nAvg bucket price = " + avgBucketPrice);
        printer.write("\nAvg bucket weight = " + avgBucketWeight);
        printer.write(prize ? "\nYou won a prize!\n" : "\n");
        printer.write(products.toString());
    }

}
