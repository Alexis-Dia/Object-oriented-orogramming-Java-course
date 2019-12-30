package by.bntu.fitr.povt.alexeyd.lab17.factory.decorator;


import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab17.factory.DataGenerator;

import java.util.List;

public abstract class InputDecorator implements DataGenerator {

    public abstract List<Product> read();
}
