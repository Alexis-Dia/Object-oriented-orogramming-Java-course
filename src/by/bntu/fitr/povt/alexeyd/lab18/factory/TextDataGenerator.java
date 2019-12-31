package by.bntu.fitr.povt.alexeyd.lab18.factory;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab18.utils.InputUtil;
import by.bntu.fitr.povt.alexeyd.lab18.utils.ShopAssistance;

import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab18.utils.Constant.SRC_RESOURCES_INPUT_TEXT_PATH;

public class TextDataGenerator implements DataGenerator {

    private String fileName = SRC_RESOURCES_INPUT_TEXT_PATH;

    public List<Product> read() {
        String data = InputUtil.readText(fileName);
        String[][] rowArr = ShopAssistance.prepareData(data);
        List<Product> products = ShopAssistance.parseProduct(rowArr);
        return products;
    }

}
