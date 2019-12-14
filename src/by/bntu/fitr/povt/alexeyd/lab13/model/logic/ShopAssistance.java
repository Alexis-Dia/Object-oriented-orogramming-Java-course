package by.bntu.fitr.povt.alexeyd.lab13.model.logic;

import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;

import java.util.List;

public class ShopAssistance {

    public static double calculateAvgPrice(List<Product> list) {
        double total = 0.0;
        for (Product ob: list) {
            total += ob.getPrice();
        }

        return total / list.size();
    }

    public static double calculateAvgWeight(List<Product> list) {
        double weight = 0.0;

        for (Product ob: list) {
            weight += ob.getWeight();
        }

        return  weight;
    }

    public static boolean getPrize(List<Product> list) {
        for (Product ob: list) {
            if (ob.isHelpChildren()) {
                return true;
            }
        }

        return false;
    }

}
