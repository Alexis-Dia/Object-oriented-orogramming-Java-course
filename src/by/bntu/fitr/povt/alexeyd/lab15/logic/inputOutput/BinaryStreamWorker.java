package by.bntu.fitr.povt.alexeyd.lab15.logic.inputOutput;

import java.io.*;

public class BinaryStreamWorker {

    // before JDK 6.0
    public static void write(String fileName) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileName);

            for (int i = 0; i < 1000; i++) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // before JDK 6.0
    public static void read(String fileName) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);

            int temp;
            while ((temp = inputStream.read()) != -1) {
                System.out.println(temp + " ");
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
    }

}
