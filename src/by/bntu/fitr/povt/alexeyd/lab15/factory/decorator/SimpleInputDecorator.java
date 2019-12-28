package by.bntu.fitr.povt.alexeyd.lab15.factory.decorator;

import by.bntu.fitr.povt.alexeyd.lab15.factory.DataGenerator;
import by.bntu.fitr.povt.alexeyd.lab15.model.entity.Product;

import java.util.List;

public class SimpleInputDecorator implements DataGenerator {

    DataGenerator dataGenerator;

    public SimpleInputDecorator(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

    public List<Product> read() {
        List<Product> data = dataGenerator.read();
        return data;
    }
}
