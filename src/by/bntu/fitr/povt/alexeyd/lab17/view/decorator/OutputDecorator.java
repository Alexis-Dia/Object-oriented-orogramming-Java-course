package by.bntu.fitr.povt.alexeyd.lab17.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab17.view.Printer;

import java.util.List;

public abstract class OutputDecorator implements Printer {

    public abstract void write(List<Product> products);
}
