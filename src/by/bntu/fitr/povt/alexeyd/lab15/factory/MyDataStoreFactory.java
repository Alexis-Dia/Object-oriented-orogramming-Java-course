package by.bntu.fitr.povt.alexeyd.lab15.factory;

public class MyDataStoreFactory extends DataStoreFactory {

    public static final String RANDOM = "random";
    public static final String TEXT = "text";
    public static final String BINARY = "binary";

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
