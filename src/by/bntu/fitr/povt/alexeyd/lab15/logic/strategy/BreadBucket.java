package by.bntu.fitr.povt.alexeyd.lab15.logic.strategy;

import by.bntu.fitr.povt.alexeyd.lab15.logic.strategy.comparator.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Product;

import java.util.List;

public class BreadBucket extends Bucket {

    @Override
    public void addProduct(Product product) {
        getList().add((Bread) product);
    }

    public BreadBucket() {
        comparator = new ComparatorByPriceAndId();
    }

    public List<Product> getAll() {
        return getList();
    }

}