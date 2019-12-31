package by.bntu.fitr.povt.alexeyd.lab18.view;

import by.bntu.fitr.povt.alexeyd.lab18.entity.Product;
import org.apache.log4j.Logger;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_OUTPUT_BINARY_PATH;
import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.UTF_8;
import static by.bntu.fitr.povt.alexeyd.lab18.utils.Constant.MY_SUPER_LOGGER;
import static by.bntu.fitr.povt.alexeyd.lab18.utils.Constant.SEND_ERROR_MESSAGE_TO_LOG;

public class BinaryPrinter implements Printer {

    private static final Logger LOG = Logger.getLogger(MY_SUPER_LOGGER);

    // before JDK 6.0
    @Override
    public void write(List<Product> products) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(SRC_RESOURCES_OUTPUT_BINARY_PATH,true);
            byte[] byteArr = (products + "\n").toString().getBytes(Charset.forName(UTF_8));
            outputStream.write(byteArr);
        } catch (IOException exception) {
            LOG.error(SEND_ERROR_MESSAGE_TO_LOG);
            exception.printStackTrace();
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
