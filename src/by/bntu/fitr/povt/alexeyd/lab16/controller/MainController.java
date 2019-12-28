package by.bntu.fitr.povt.alexeyd.lab16.controller;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.factory.DataGenerator;
import by.bntu.fitr.povt.alexeyd.lab16.factory.DataStoreFactory;
import by.bntu.fitr.povt.alexeyd.lab16.factory.MyDataStoreFactory;
import by.bntu.fitr.povt.alexeyd.lab16.factory.decorator.SimpleInputDecorator;
import by.bntu.fitr.povt.alexeyd.lab16.utils.Constant;
import by.bntu.fitr.povt.alexeyd.lab16.utils.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab16.utils.SubGroup;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.bread.ComparatorBySortAndFlavor;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.milk.ComparatorByFatAndCarbons;
import by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.orange.ComparatorByShapeAndDiameter;
import by.bntu.fitr.povt.alexeyd.lab16.view.MyPrintFactory;
import by.bntu.fitr.povt.alexeyd.lab16.view.PrintFactory;
import by.bntu.fitr.povt.alexeyd.lab16.view.Printer;

import java.util.*;

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

        //InputUtil.write(Constant.SRC_RESOURCES_INPUT_AUTOSERIALIZABLE_BINARY_PATH, list);

        DataStoreFactory dataStoreFactory = new MyDataStoreFactory();
        DataGenerator dataGenerator = dataStoreFactory.orderData(Constant.InputName.BINARY_SERIALIZABLE.getName());

        /*Input decorator pattern in action:*/
        dataGenerator = new SimpleInputDecorator(dataGenerator);
        List<Product> products = dataGenerator.read();

        //products.remove(3);
        double avgBucketPrice = ShopAssistance.calculateAvgPrice(products);
        double avgBucketWeight = ShopAssistance.calculateAvgWeight(products);
        boolean prize = ShopAssistance.getPrize(products);

        /*Strategy pattern in action:*/
/*        Bucket bucket = ShopAssistance.getExampleOfBucket(STRATEGIES_MAP, COMPARE_BY_FAT_AND_CARBONS);
        products = ((MilkBucket) bucket).getAll();*/

        //Collections.sort(products);
        Collections.sort(products, new ComparatorByPriceAndId());

        PrintFactory printFactory = new MyPrintFactory();
        Printer printer = printFactory.order(Constant.OutputName.BINARY.getName());

        /*Output decorator pattern in action:*/
        //printer = new LowerCaseOutputDecorator(new UpperCaseOutputDecorator(printer));

        printer.printToConsole("Found index: " + products.get(SubGroup.FRUIT.getGroupCode()));
        printer.printToConsole("\nAvg bucket price = " + avgBucketPrice);
        printer.printToConsole("\nAvg bucket weight = " + avgBucketWeight);
        printer.printToConsole(prize ? "\nYou won a prize!\n" : "\n");
        printer.write(products);
    }

}
