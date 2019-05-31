package by.bntu.fitr.povt.alexeyd.lab10.controller;

import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bucket;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Orange;
import by.bntu.fitr.povt.alexeyd.lab10.model.logic.ShopAssistance;
import by.bntu.fitr.povt.alexeyd.lab10.view.Printer;

public class Controller {

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

        Printer.print(bucket + "");
        Printer.print("\nAvg bucket price = " + avgBucketPrice);
        Printer.print("\nAvg bucket weight = " + avgBucketWeight);
        Printer.print(prize ? "\nYou won a prize!" : "\n");
    }

}
