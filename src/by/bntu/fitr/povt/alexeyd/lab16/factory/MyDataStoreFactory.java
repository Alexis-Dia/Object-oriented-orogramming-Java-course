package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.utils.Constant;

import java.util.HashMap;
import java.util.Map;

import static by.bntu.fitr.povt.alexeyd.lab16.utils.Constant.*;

public class MyDataStoreFactory extends DataStoreFactory {

    private static final Map<String, DataGenerator> GENERATORS_MAP;

    static {
        GENERATORS_MAP = new HashMap();
        GENERATORS_MAP.put(Constant.RANDOM, new RandomDataGenerator());
        GENERATORS_MAP.put(Constant.TEXT, new TextDataGenerator());
        GENERATORS_MAP.put(Constant.BINARY, new BinaryDataGenerator());
        GENERATORS_MAP.put(Constant.BINARY_SERIALIZABLE, new SerializableBinaryDataGenerator());
    }


    DataGenerator runFactory(String item) {
        if (item.equals(RANDOM)) {
            return GENERATORS_MAP.get(Constant.RANDOM);
        } else if (item.equals(TEXT)) {
            return GENERATORS_MAP.get(Constant.TEXT);
        } else if (item.equals(BINARY)) {
            return GENERATORS_MAP.get(Constant.BINARY);
        } else if(item.equals(Constant.BINARY_SERIALIZABLE) || item.equals(Constant.CUSTOM_BINARY_SERIALIZABLE)) {
            return GENERATORS_MAP.get(Constant.BINARY_SERIALIZABLE);
        } else return null;
    }
}
