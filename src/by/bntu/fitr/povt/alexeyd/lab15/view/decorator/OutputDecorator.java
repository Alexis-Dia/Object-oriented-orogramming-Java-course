package by.bntu.fitr.povt.alexeyd.lab15.view.decorator;

import by.bntu.fitr.povt.alexeyd.lab15.view.Printer;

public abstract class OutputDecorator implements Printer {

    public abstract void write(String msg);
}
