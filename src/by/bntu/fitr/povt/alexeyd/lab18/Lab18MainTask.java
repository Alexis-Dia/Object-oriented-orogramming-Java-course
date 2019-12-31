package by.bntu.fitr.povt.alexeyd.lab18;

import by.bntu.fitr.povt.alexeyd.lab18.controller.MainController;

/**
 * Number of laboratory work is №18. Generics in Java.
 * This programme was created by Alexey Nikolaevich Druzik in 31.12.2019, v1.1. Number of group is 30701117.
 * MainTask1. It is necessary to refactor the application of the previous laboratory work in such a way that the
 * resulting data is saved in a log file, as well as to log any exceptional situations that may arise during the
 * operation of the program. In addition, it is necessary to expand the hierarchy of printers with another component
 * whose output will be based on the log4j library.
 */
public class Lab18MainTask {

    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.executeMainTask();
    }
}
