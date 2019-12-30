package by.bntu.fitr.povt.alexeyd.lab17.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab17.view.Printer;

import java.util.List;

public class LowerCaseOutputDecorator extends OutputDecorator {

    Printer printer;

    public LowerCaseOutputDecorator(Printer printer) {
        this.printer = printer;
    }

    public void write(List<Product> products) {
        printer.write(products);
    }
}