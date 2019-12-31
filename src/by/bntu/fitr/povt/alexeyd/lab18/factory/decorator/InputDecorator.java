package by.bntu.fitr.povt.alexeyd.lab18.factory.decorator;


import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab18.factory.DataGenerator;

import java.util.List;

public abstract class InputDecorator implements DataGenerator {

    public abstract List<Product> read();
}
