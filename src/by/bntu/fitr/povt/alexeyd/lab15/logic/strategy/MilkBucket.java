package by.bntu.fitr.povt.alexeyd.lab15.logic.strategy;

import by.bntu.fitr.povt.alexeyd.lab15.logic.strategy.comparator.ComparatorByPriceAndId;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Milk;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Product;

import java.util.List;

public class MilkBucket extends Bucket {

    @Override
    public void addProduct(Product product) {
        getList().add((Milk) product);
    }

    public MilkBucket() {
        comparator = new ComparatorByPriceAndId();
    }

    public List<Product> getAll() {
        return getList();
    }

}
