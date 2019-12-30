package by.bntu.fitr.povt.alexeyd.lab16.factory.decorator;


import by.bntu.fitr.povt.alexeyd.lab16.factory.DataGenerator;

import java.util.List;

public abstract class InputDecorator implements DataGenerator {

    public abstract List read();
}
