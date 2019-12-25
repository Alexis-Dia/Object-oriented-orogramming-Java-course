package by.bntu.fitr.povt.alexeyd.lab16.logic.strategy.comparator;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Milk;

import java.util.Comparator;

public class ComparatorByFatAndCarbons implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Double x1 = ((Milk) o1).getFat();
        Double x2 = ((Milk) o2).getFat();
        int sComp = x1.compareTo(x2);

        if (sComp != 0) {
            return sComp;
        }

        Double x3 = ((Milk) o1).getCarbons();
        Double x4 = ((Milk) o2).getCarbons();
        return x3.compareTo(x4);
    }

}
