package by.bntu.fitr.povt.alexeyd.lab10.model.logic;

import by.bntu.fitr.povt.alexeyd.lab10.model.entity.Bucket;

public class ShopAssistance {

    public static double calculateAvgPrice(Bucket bucket) {
        double total = bucket.bread.getPrice()
                + bucket.milk.getPrice()
                + bucket.orange.getPrice();
        return total / Bucket.DEFAULT_PRODUCT_AMOUNT;
    }

    public static double calculateAvgWeight(Bucket bucket) {
        return  bucket.bread.getWeight()
                + bucket.milk.getWeight()
                + bucket.orange.getWeight();
    }

    public static boolean getPrize(Bucket bucket) {
        return bucket.bread.isHelpChildren()
                || bucket.milk.isHelpChildren()
                || bucket.orange.isHelpChildren();
    }

}
