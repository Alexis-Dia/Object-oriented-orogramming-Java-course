package by.bntu.fitr.povt.alexeyd.lab16.logic;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.io.*;
import java.util.List;

public class FileWorkerSinceJDK7WithAutomaticSerialization {

    public static void write(String fileName, List<Product> product) {
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

    public static List<Product> read(String fileName) {
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
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        return student;
    }
}
