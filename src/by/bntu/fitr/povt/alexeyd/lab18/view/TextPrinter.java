package by.bntu.fitr.povt.alexeyd.lab18.view;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab18.utils.Constant.SRC_RESOURCES_OUTPUT_TEXT_PATH;
import static by.bntu.fitr.povt.alexeyd.lab18.utils.Constant.MY_SUPER_LOGGER;

public class TextPrinter implements Printer {

    private static final Logger LOG = Logger.getLogger(MY_SUPER_LOGGER);

    @Override
    public void write(List<Product> products) {
        try(Writer stream = new FileWriter(SRC_RESOURCES_OUTPUT_TEXT_PATH, true)) {
            stream.write(products.toString());
        } catch (IOException exception) {
            LOG.error(exception);
            exception.printStackTrace();
        }
    }
}
