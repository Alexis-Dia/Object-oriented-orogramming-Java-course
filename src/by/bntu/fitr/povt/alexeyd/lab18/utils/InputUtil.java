package by.bntu.fitr.povt.alexeyd.lab18.utils;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab18.utils.Constant.MY_SUPER_LOGGER;

public class InputUtil {

    private static final Logger LOG = Logger.getLogger(MY_SUPER_LOGGER);

    public static void write(String fileName, List<Product> product) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(   //Allows immediately write primitives
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));

            stream.writeObject(product);

        } catch (IOException exception) {
            LOG.error(exception);
            exception.printStackTrace();
        } finally {
            if (stream != null) {
                try {
                    stream.flush();
                    stream.close();
                } catch (IOException exception) {
                    LOG.error(exception);
                    exception.printStackTrace();
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
        } catch (IOException exception) {
            LOG.error(exception);
            exception.printStackTrace();
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
                } catch (IOException exception) {
                    LOG.error(exception);
                    exception.printStackTrace();
                }
            }
        }
        return data;
    }

    public static List<Product> readUsingObjectInputStream(String fileName) {
        List<Product> student = null;
        ObjectInputStream stream = null;
        try {
            stream = new ObjectInputStream(   //Allows immediately write primitives
                new BufferedInputStream(
                    new FileInputStream(fileName)));

            student= (List<Product>) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) { //since JDK7.0
            System.out.println(exception);
        } finally {
            if (stream != null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    LOG.error(exception);
                    exception.printStackTrace();
                }
            }

        }
        return student;
    }
}
