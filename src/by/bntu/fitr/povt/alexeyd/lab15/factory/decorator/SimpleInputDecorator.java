package by.bntu.fitr.povt.alexeyd.lab15.factory.decorator;

import by.bntu.fitr.povt.alexeyd.lab15.factory.DataGenerator;

import java.util.List;

public class SimpleInputDecorator implements DataGenerator {

    DataGenerator dataGenerator;

    public SimpleInputDecorator(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

    public List read() {
        List data = dataGenerator.read();
        return data;
    }
}
