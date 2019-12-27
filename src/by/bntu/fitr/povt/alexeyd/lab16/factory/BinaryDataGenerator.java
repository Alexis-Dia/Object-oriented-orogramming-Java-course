package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;
import by.bntu.fitr.povt.alexeyd.lab16.utils.InputUtil;
import by.bntu.fitr.povt.alexeyd.lab16.utils.ShopAssistance;

import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_INPUT_BINARY_PATH;
import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH;

public class BinaryDataGenerator implements DataGenerator {

    private static final String fileName = SRC_RESOURCES_INPUT_BINARY_PATH;
    private static final String fileNameSerializable = SRC_RESOURCES_OUTPUT_BINARY_SERIALIZABLE_PATH;


    // before JDK 6.0
    public List<Product> read() {
        String data = InputUtil.readBinary(fileName);
        String[][] rowArr = ShopAssistance.prepareData(data);
        List<Product> products = ShopAssistance.parseProduct(rowArr);
        return products;
    }

}
