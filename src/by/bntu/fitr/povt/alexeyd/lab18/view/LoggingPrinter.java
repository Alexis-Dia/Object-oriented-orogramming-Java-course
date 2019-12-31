package by.bntu.fitr.povt.alexeyd.lab18.view;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import org.apache.log4j.Logger;

import java.util.List;

public class LoggingPrinter implements Printer {

    private static final String MY_SUPER_LOGGER_DATA = "MySuperLoggerData";
    private static final Logger LOGGER = Logger.getLogger(MY_SUPER_LOGGER_DATA);

    @Override
    public void write(List<Product> products) {
        final String message = products.toString();
        LOGGER.info(message);
    }
}
