package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.utils.ShopAssistance;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_INPUT_TEXT_PATH;

public class TextDataGenerator implements DataGenerator {

    private String fileName = SRC_RESOURCES_INPUT_TEXT_PATH;

    // after JDK 6.0
    public List<Product> read() {
        String data = "";
        List<Product> products;
        try(Reader stream = new FileReader(fileName)) {
            int temp;

            while ((temp = stream.read()) != -1) {
                char symbol = ((char) temp);
                data += String.valueOf(symbol);
                //System.out.println(temp + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        products = prepareData(data);
        return products;
    }

    private List<Product> prepareData(String data) {
        String[][] rowArr = ShopAssistance.prepareData(data);
        return ShopAssistance.parseProduct(rowArr);
    }

}
