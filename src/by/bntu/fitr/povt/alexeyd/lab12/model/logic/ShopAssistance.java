package by.bntu.fitr.povt.alexeyd.lab12.model.logic;

import by.bntu.fitr.povt.alexeyd.lab12.model.entity.Bucket;
import by.bntu.fitr.povt.alexeyd.lab12.model.entity.Product;

public class ShopAssistance {

    public static double calculateAvgPrice(Bucket bucket) {
        double total = 0.0;
        Product[][] products = bucket.getContainer();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null) {
                    total += products[i][j].getPrice();
                }
            }
        }

        return total / Product.productAmount;
    }

    public static double calculateAvgWeight(Bucket bucket) {
        Product[][] products = bucket.getContainer();
        double weight = 0.0;
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null) {
                    weight += products[i][j].getWeight();
                }
            }
        }

        return  weight;
    }

    public static boolean getPrize(Bucket bucket) {
        Product[][] products = bucket.getContainer();
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products[i].length; j++) {
                if (products[i][j] != null) {
                    if (products[i][j].isHelpChildren()) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
