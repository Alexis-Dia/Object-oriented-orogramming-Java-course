package by.bntu.fitr.povt.alexeyd.lab13.model.logic;

import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistance {

    public static double calculateAvgPrice(List list) {
        double total = 0.0;
        for (Object ob: list) {
            total += ((Product)ob).getPrice();
        }

        return total / list.size();
    }

    public static double calculateAvgWeight(List list) {
        double weight = 0.0;

        for (Object ob: list) {
            weight += ((Product)ob).getWeight();
        }

        return  weight;
    }

    public static boolean getPrize(List list) {
        for (Object ob: list) {
            if (((Product)ob).isHelpChildren()) {
                return true;
            }
        }

        return false;
    }

    public static List findByPrice(List list, double min, double max) {
        List result = new ArrayList<>();
        for (Object ob: list) {
            double price = ((Product)ob).getPrice();
            if (price >= min && price <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List findByWeight(List list, int min, int max) {
        List result = new ArrayList<>();
        for (Object ob: list) {
            int weight = ((Product)ob).getWeight();
            if (weight >= min && weight <=max) {
                result.add(ob);
            }
        }

        return result;
    }

    public static List findById(List list, int value) {
        List result = new ArrayList<>();
        for (Object ob: list) {
            int id = ((Product)ob).getId();
            if (id == value) {
                result.add(ob);
            }
        }

        return result;
    }

}
