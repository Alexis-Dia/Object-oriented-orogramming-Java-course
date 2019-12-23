package by.bntu.fitr.povt.alexeyd.lab15.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab15.view.Printer;

import static by.bntu.fitr.povt.alexeyd.lab15.util.Constant.*;

public class SimpleOutputDecorator extends OutputDecorator {

    private static final String DECORATED = "Decorated: ";
    Printer printer;

    public SimpleOutputDecorator(Printer printer) {
        this.printer = printer;
    }

    public void write(String msg) {
        String decoratedMsg;
        decoratedMsg = msg.replaceAll(NEW_LINE_SYMBOL, EMPTY_STRING);
        decoratedMsg = decoratedMsg.replaceAll(CARRITAGR_RETURN_SYMBOL, EMPTY_STRING);
        decoratedMsg = DECORATED + decoratedMsg + NEW_LINE_SYMBOL;
        printer.write(decoratedMsg);
    }
}
