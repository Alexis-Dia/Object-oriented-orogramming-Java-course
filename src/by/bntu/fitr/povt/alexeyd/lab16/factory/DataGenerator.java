package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.util.ArrayList;
import java.util.List;

public interface DataGenerator {

    List<Product> products = new ArrayList<>();

    List<Product> read();
}
