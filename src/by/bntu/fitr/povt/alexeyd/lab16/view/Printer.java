package by.bntu.fitr.povt.alexeyd.lab16.view;

import by.bntu.fitr.povt.alexeyd.lab16.entity.Product;

import java.util.List;

public interface Printer {

     void write(List<Product> products);

     default void printToConsole(String msg) {
          System.out.println(msg);
     };
}
