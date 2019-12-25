package by.bntu.fitr.povt.alexeyd.lab16.factory.decorator;

import by.bntu.fitr.povt.alexeyd.lab16.factory.DataGenerator;

public class SimpleInputDecorator implements DataGenerator {

    DataGenerator dataGenerator;

    public SimpleInputDecorator(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

    public String read() {
        String data = dataGenerator.read();
        return data;
    }
}
