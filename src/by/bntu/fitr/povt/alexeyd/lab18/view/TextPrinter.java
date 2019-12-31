package by.bntu.fitr.povt.alexeyd.lab18.view;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_OUTPUT_TEXT_PATH;

public class TextPrinter implements Printer {

    @Override
    public void write(List<Product> products) {
        try(Writer stream = new FileWriter(SRC_RESOURCES_OUTPUT_TEXT_PATH, true)) {
            stream.write(products.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
