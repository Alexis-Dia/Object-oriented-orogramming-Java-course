package by.bntu.fitr.povt.alexeyd.lab16.utils.strategy.comparator.orange;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Orange;

import java.util.Comparator;

public class ComparatorByShapeAndDiameter implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        String x1 = ((Orange) o1).getForm();
        String x2 = ((Orange) o2).getForm();
        int sComp = x1.compareTo(x2);

        if (sComp != 0) {
            return sComp;
        }

        Double x3 = ((Orange) o1).getDiameter();
        Double x4 = ((Orange) o2).getDiameter();
        return x3.compareTo(x4);
    }

}
