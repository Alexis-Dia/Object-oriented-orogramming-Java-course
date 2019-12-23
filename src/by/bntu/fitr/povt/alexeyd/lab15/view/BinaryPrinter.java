package by.bntu.fitr.povt.alexeyd.lab15.view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import static by.bntu.fitr.povt.alexeyd.lab15.util.Constant.SRC_RESOURCES_OUTPUT_BINARY_PATH;
import static by.bntu.fitr.povt.alexeyd.lab15.util.Constant.UTF_8;

public class BinaryPrinter implements Printer {

    // before JDK 6.0
    @Override
    public void write(String msg) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(SRC_RESOURCES_OUTPUT_BINARY_PATH,true);
            byte[] byteArr = msg.getBytes(Charset.forName(UTF_8));
            outputStream.write(byteArr);
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
}
