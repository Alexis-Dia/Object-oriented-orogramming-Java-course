package by.bntu.fitr.povt.alexeyd.lab16.view;

import java.util.List;

public interface Printer {

     void write(List products);

     default void printToConsole(String msg) {
          System.out.println(msg);
     };
}
