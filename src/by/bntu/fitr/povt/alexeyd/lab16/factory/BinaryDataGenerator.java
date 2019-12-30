package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.utils.InputUtil;
import by.bntu.fitr.povt.alexeyd.lab16.utils.ShopAssistance;

import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_INPUT_BINARY_PATH;

public class BinaryDataGenerator implements DataGenerator {

    private static final String fileName = SRC_RESOURCES_INPUT_BINARY_PATH;

    public List read() {
        String data = InputUtil.readBinary(fileName);
        String[][] rowArr = ShopAssistance.prepareData(data);
        List products = ShopAssistance.parseProduct(rowArr);
        return products;
    }

}
