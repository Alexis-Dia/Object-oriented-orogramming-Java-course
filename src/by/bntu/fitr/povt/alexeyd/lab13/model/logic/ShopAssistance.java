package by.bntu.fitr.povt.alexeyd.lab13.model.logic;

import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;

import java.util.ArrayList;
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

    public static List<Product> findByPrice(List<Product> list, double min, double max) {
        List<Product> result = new ArrayList<>();
        for (Product ob: list) {
            double price = ob.getPrice();
            if (price >= min && price <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List<Product> findByWeight(List<Product> list, int min, int max) {
        List<Product> result = new ArrayList<>();
        for (Product ob: list) {
            int weight = ob.getWeight();
            if (weight >= min && weight <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List<Product> findById(List<Product> list, int value) {
        List<Product> result = new ArrayList<>();
        for (Product ob: list) {
            int id = ob.getId();
            if (id == value) {
                result.add(ob);
            }
        }

        return result;
    }

}
