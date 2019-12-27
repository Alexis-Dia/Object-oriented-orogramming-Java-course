package by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.util.Comparator;

public class ComparatorByPriceAndId implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Double x1 = ((Product) o1).getPrice();
        Double x2 = ((Product) o2).getPrice();
        int sComp = x1.compareTo(x2);

        if (sComp != 0) {
            return sComp;
        }

        Integer x3 = ((Product) o1).getId();
        Integer x4 = ((Product) o2).getId();
        return x3.compareTo(x4);
    }

}
