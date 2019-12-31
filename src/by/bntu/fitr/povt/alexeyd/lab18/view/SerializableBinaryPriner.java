package by.bntu.fitr.povt.alexeyd.lab18.view;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab16.utils.Constant.SRC_RESOURCES_OUTPUT_BINARY_PATH;

public class SerializableBinaryPriner implements Printer {

    // before JDK 6.0
    @Override
    public void write(List<Product> products) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(   //Allows immediately write primitives
                new BufferedOutputStream(
                    new FileOutputStream(SRC_RESOURCES_OUTPUT_BINARY_PATH)));

            stream.writeObject(products);

        } catch (IOException exception) {
            //log
        } finally {
            if (stream != null) {
                try {
                    stream.flush();
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
