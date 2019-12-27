package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.logic.ShopAssistance;

import java.io.*;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_INPUT_BINARY_PATH;
import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH;

public class BinaryDataGenerator implements DataGenerator {

    private static final String fileName = SRC_RESOURCES_INPUT_BINARY_PATH;
    private static final String fileNameSerializable = SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH;


    // before JDK 6.0
    public List<Product> read() {
        InputStream inputStream = null;
        List<Product> products = null;
        String data = "";
        try {
            inputStream = new FileInputStream(fileName);

            int temp;
            while ((temp = inputStream.read()) != -1) {
                char symbol = ((char) temp);
                data += String.valueOf(symbol);
                products = prepareData(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return products;
    }

    private List<Product> prepareData(String data) {
        String[][] rowArr = ShopAssistance.prepareData(data);
        return ShopAssistance.parseProduct(rowArr);
    }

}
