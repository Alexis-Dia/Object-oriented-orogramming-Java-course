package by.bntu.fitr.povt.alexeyd.lab15.factory.decorator;


import by.bntu.fitr.povt.alexeyd.lab15.factory.DataGenerator;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Product;

import java.util.List;

public abstract class InputDecorator implements DataGenerator {

    public abstract List<Product> read();
}
