package by.bntu.fitr.povt.alexeyd.lab18.factory.decorator;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab18.factory.DataGenerator;

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
