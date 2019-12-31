package by.bntu.fitr.povt.alexeyd.lab18.view;

public abstract class PrintFactory {

    abstract Printer createFactory(String item);

    public Printer order(String item) {
        final Printer factory = createFactory(item);
        return factory;
    }

}
