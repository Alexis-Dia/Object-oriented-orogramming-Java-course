package by.bntu.fitr.povt.alexeyd.lab15.logic;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.io.*;
import java.util.List;

public class InputUtil {

    public static void write(String fileName, List product) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(   //Allows immediately write primitives
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));

            stream.writeObject(product);

        } catch (IOException exception) {
            //log
        } finally {
            if (stream != null) {
                try {
                    stream.flush();
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    // after JDK 6.0
    public static String readText(String fileName) {
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

    public static String readBinary(String fileName) {
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
