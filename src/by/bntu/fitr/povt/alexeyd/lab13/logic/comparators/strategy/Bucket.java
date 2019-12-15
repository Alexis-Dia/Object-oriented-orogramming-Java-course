package by.bntu.fitr.povt.alexeyd.lab13.logic.comparators.strategy;

import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Bucket {

    Comparator comparator;

    List<Product> products;

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

    public List <Product> getList() {
        return products;
    }

}
