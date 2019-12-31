package by.bntu.fitr.povt.alexeyd.lab18.utils.strategy;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Bread;
import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab18.utils.strategy.comparator.ComparatorByPriceAndId;

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