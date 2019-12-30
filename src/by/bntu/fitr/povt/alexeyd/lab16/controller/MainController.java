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
import by.bntu.fitr.povt.alexeyd.lab16.view.MyPrintFactory;
import by.bntu.fitr.povt.alexeyd.lab16.view.PrintFactory;
import by.bntu.fitr.povt.alexeyd.lab16.view.Printer;

import java.util.Collections;
import java.util.List;

public class MainController {

    private static final String FOUND_INDEX = "Found index: ";
    private static final String AVG_BUCKET_PRICE = "\nAvg bucket price = ";
    private static final String AVG_BUCKET_WEIGHT = "\nAvg bucket weight = ";
    private static final String YOU_WON_A_PRIZE = "\nYou won a prize!\n";

    public void executeMainTask() {

        //InputUtil.write(Constant.SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH, ShopAssistance.getExampleOfProductList());

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
/*        Bucket bucket = ShopAssistance.getExampleOfBucket(COMPARE_BY_FAT_AND_CARBONS);
        products = ((MilkBucket) bucket).getAll();*/

        //Collections.sort(products);
        Collections.sort(products, new ComparatorByPriceAndId());

        PrintFactory printFactory = new MyPrintFactory();
        Printer printer = printFactory.order(Constant.OutputName.BINARY.getName());

        /*Output decorator pattern in action:*/
        //printer = new LowerCaseOutputDecorator(new UpperCaseOutputDecorator(printer));

        printer.printToConsole(FOUND_INDEX + products.get(SubGroup.FRUIT.getGroupCode()));
        printer.printToConsole(AVG_BUCKET_PRICE + avgBucketPrice);
        printer.printToConsole(AVG_BUCKET_WEIGHT + avgBucketWeight);
        printer.printToConsole(prize ? YOU_WON_A_PRIZE : "\n");
        printer.write(products);
    }

}
