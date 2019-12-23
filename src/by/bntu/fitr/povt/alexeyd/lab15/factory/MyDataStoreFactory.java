package by.bntu.fitr.povt.alexeyd.lab15.factory;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.*;

public class MyDataStoreFactory extends DataStoreFactory {

    DataGenerator runFactory(String item) {
        if (item.equals(RANDOM)) {
            return new RandomDataGenerator();
        } else if (item.equals(TEXT)) {
            return new TextDataGenerator();
        } else if (item.equals(BINARY)) {
            return new BinaryDataGenerator();
        } else return null;
    }
}
