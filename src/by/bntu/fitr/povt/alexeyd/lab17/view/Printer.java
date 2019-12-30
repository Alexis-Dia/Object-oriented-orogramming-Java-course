package by.bntu.fitr.povt.alexeyd.lab17.view;

import by.bntu.fitr.povt.alexeyd.lab17.entity.Product;

import java.util.List;

public interface Printer {

     void write(List<Product> products);

     default void printToConsole(String msg) {
          System.out.println(msg);
     };
}
