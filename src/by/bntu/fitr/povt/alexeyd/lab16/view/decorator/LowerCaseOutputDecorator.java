package by.bntu.fitr.povt.alexeyd.lab16.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab16.view.Printer;

import java.util.List;

public class LowerCaseOutputDecorator extends OutputDecorator {

    Printer printer;

    public LowerCaseOutputDecorator(Printer printer) {
        this.printer = printer;
    }

    public void write(List products) {
        printer.write(products);
    }
}