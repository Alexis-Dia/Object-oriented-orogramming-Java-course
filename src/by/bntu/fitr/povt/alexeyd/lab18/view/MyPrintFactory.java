package by.bntu.fitr.povt.alexeyd.lab18.view;

import by.bntu.fitr.povt.alexeyd.lab18.utils.Constant;

import java.util.HashMap;
import java.util.Map;

public class MyPrintFactory extends PrintFactory {

    private static final Map<String, Printer> PRINTERS_MAP;

    static {
        PRINTERS_MAP = new HashMap();
        PRINTERS_MAP.put(Constant.OutputName.CONSOLE.getName(), new ConsolePrinter());
        PRINTERS_MAP.put(Constant.OutputName.TEXT.getName(), new TextPrinter());
        PRINTERS_MAP.put(Constant.OutputName.BINARY.getName(), new BinaryPrinter());
        PRINTERS_MAP.put(Constant.OutputName.BINARY_SERIALIZABLE.getName(), new SerializableBinaryPriner());
        PRINTERS_MAP.put(Constant.OutputName.LOGGER.getName(), new LoggingPrinter());
    }

    @Override
    Printer createFactory(String item) {
        if (item.equals(Constant.OutputName.CONSOLE.getName()) ||
            item.equals(Constant.OutputName.TEXT.getName()) ||
            item.equals(Constant.OutputName.BINARY.getName()) ||
            item.equals(Constant.OutputName.BINARY_SERIALIZABLE.getName()) ||
            item.equals(Constant.OutputName.LOGGER.getName())) {
            return PRINTERS_MAP.get(item);
        } else return null;
    }
}
