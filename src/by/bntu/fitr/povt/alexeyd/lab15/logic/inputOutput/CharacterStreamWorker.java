package by.bntu.fitr.povt.alexeyd.lab15.logic.inputOutput;

import java.io.*;

public class CharacterStreamWorker {

    // since JDK 7.0
    public static void write(String fileName) {
        try(Writer stream = new FileWriter(fileName)) {
            for (int i = 0; i < 100; i++) {
                stream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // before JDK 6.0
    public static void read(String fileName) {
        try(Reader stream = new FileReader(fileName)) {
            int temp;

            while ((temp = stream.read()) != -1) {
                System.out.println(temp + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}