package by.bntu.fitr.povt.alexeyd.lab13.strategy;

import by.bntu.fitr.povt.alexeyd.lab13.logic.comparator.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab13.model.entity.Product;

import java.util.List;

public class BreadBucket extends Bucket {

    @Override
    public void addProduct(Product product) {
        getList().add((Bread) product);
    }

    public BreadBucket() {
        comparator = new ComparatorByPriceAndId();
    }

    public List getAll() {
        return getList();
    }

}