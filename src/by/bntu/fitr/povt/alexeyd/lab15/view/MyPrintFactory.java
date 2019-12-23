package by.bntu.fitr.povt.alexeyd.lab15.view;

public class MyPrintFactory extends PrintFactory {

    public static final String CONSOLE = "console";
    public static final String TEXT = "text";
    public static final String BINARY = "binary";

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
