package by.bntu.fitr.povt.alexeyd.lab15.logic.strategy.comparator;

import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Bread;

import java.util.Comparator;

public class ComparatorBySortAndFlavor implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        String x1 = ((Bread) o1).getSort();
        String x2 = ((Bread) o2).getSort();
        int sComp = x1.compareTo(x2);

        if (sComp != 0) {
            return sComp;
        }

        String x3 = ((Bread) o1).getFlour();
        String x4 = ((Bread) o2).getFlour();
        return x3.compareTo(x4);
    }

}
