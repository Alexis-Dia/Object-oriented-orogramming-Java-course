package by.bntu.fitr.povt.alexeyd.lab16.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.view.Printer;

import java.util.List;

public abstract class OutputDecorator implements Printer {

    public abstract void write(List<Product> products);
}
