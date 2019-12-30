package by.bntu.fitr.povt.alexeyd.lab17.factory.decorator;

import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab17.factory.DataGenerator;

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
