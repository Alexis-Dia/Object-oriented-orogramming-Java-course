package by.bntu.fitr.povt.alexeyd.lab16.view;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import static by.bntu.fitr.povt.alexeyd.lab15.logic.Constant.SRC_RESOURCES_OUTPUT_TEXT_PATH;

public class TextPrinter implements Printer {

    @Override
    public void write(String msg) {
        try(Writer stream = new FileWriter(SRC_RESOURCES_OUTPUT_TEXT_PATH, true)) {
            stream.write(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
