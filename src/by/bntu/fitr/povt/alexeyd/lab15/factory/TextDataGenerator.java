package by.bntu.fitr.povt.alexeyd.lab15.factory;

import java.io.*;

public class TextDataGenerator implements DataGenerator {

    // after JDK 6.0
    public String read(String fileName) {
        String data = "";
        try(Reader stream = new FileReader(fileName)) {
            int temp;

            while ((temp = stream.read()) != -1) {
                char symbol = ((char) temp);
                data += String.valueOf(symbol);
                //System.out.println(temp + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
