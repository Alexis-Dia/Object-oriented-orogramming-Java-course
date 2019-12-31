package by.bntu.fitr.povt.alexeyd.lab18.factory;

public abstract class DataStoreFactory {

    abstract DataGenerator runFactory(String item);

    public DataGenerator orderData(String item) {
        DataGenerator dataGenerator = runFactory(item);
        return dataGenerator;
    }

}
