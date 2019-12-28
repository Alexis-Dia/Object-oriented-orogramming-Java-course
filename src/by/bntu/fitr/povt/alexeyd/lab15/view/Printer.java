package by.bntu.fitr.povt.alexeyd.lab15.view;

public interface Printer {

     void write(String msg);

     default void printToConsole(String msg) {
          System.out.println(msg);
     };
}
