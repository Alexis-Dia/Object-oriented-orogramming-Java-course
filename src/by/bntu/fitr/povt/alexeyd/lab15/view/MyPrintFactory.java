package by.bntu.fitr.povt.alexeyd.lab15.view;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class MyPrintFactory extends PrintFactory {

    @Override
    Printer createFactory(String item) {
        if (item.equals(CONSOLE)) {
            return new ConsolePrinter();
        } else if (item.equals(TEXT)) {
            return new TextPrinter();
        } else if (item.equals(BINARY)) {
            return new BinaryPrinter();
        } else return null;
    }
}
