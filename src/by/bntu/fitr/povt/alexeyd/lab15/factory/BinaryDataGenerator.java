package by.bntu.fitr.povt.alexeyd.lab15.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BinaryDataGenerator implements DataGenerator {

    // before JDK 6.0
    public String read(String fileName) {
        InputStream inputStream = null;
        String data = "";
        try {
            inputStream = new FileInputStream(fileName);

            int temp;
            while ((temp = inputStream.read()) != -1) {
                char symbol = ((char) temp);
                data += String.valueOf(symbol);
                //System.out.println(temp + " ");
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
