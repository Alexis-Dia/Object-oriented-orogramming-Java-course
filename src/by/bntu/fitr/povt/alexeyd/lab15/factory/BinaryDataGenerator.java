package by.bntu.fitr.povt.alexeyd.lab15.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_INPUT_BINARY_PATH;

public class BinaryDataGenerator implements DataGenerator {

    private String fileName = SRC_RESOURCES_INPUT_BINARY_PATH;

    // before JDK 6.0
    public String read() {
        InputStream inputStream = null;
        String data = "";
        try {
            inputStream = new FileInputStream(fileName);

            int temp;
            while ((temp = inputStream.read()) != -1) {
                char symbol = ((char) temp);
                data += String.valueOf(symbol);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return data;
    }

}
