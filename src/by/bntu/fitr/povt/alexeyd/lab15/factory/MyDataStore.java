package by.bntu.fitr.povt.alexeyd.lab15.factory;

public class MyDataStore extends DataStore{

    DataGenerator runFactory(String item) {
        if (item.equals("random")) {
            return new RandomDataGenerator();
        } else if (item.equals("text")) {
            return new TextDataGenerator();
        } else if (item.equals("binary")) {
            return new BinaryDataGenerator();
        } else return null;
    }
}
