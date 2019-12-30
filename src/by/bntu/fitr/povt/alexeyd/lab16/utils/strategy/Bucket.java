package by.bntu.fitr.povt.alexeyd.lab16.utils.strategy;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Bucket {

    Comparator comparator;

    List products;

    public abstract void addProduct(Product product);

    public Bucket() {
        products = new ArrayList<>();
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public void performSorting() {
        Collections.sort(products, comparator);
    }

    public List getList() {
        return products;
    }

}
