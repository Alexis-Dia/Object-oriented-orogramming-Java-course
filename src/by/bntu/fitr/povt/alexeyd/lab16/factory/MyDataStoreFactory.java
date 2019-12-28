package by.bntu.fitr.povt.alexeyd.lab16.factory;

import by.bntu.fitr.povt.alexeyd.lab16.utils.Constant;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class MyDataStoreFactory extends DataStoreFactory {

    DataGenerator runFactory(String item) {
        if (item.equals(RANDOM)) {
            return new RandomDataGenerator();
        } else if (item.equals(TEXT)) {
            return new TextDataGenerator();
        } else if (item.equals(BINARY)) {
            return new BinaryDataGenerator();
        } else if(item.equals(Constant.BINARY_SERIALIZABLE) || item.equals(Constant.CUSTOM_BINARY_SERIALIZABLE)) {
            return new SerializableBinaryDataGenerator();
        } else return null;
    }
}
