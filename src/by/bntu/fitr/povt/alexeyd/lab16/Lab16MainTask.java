package by.bntu.fitr.povt.alexeyd.lab16;

import by.bntu.fitr.povt.alexeyd.lab16.controller.MainController;

/**
 * Number of laboratory work is №16. Serialization in Java.
 * This programme was created by Alexey Nikolaevich Druzik in 24.12.2019, v1.1. Number of group is 30701117.
 * MainTask1. Add an additional two ways to initialize objects using standard and custom (“custom”) serialization.
 * MainTask2. Try to refactor the View layer so that in the controller the printer object is returned using the creator object,
 * the method of which would take ready-made objects from a container of type Map. The key in this container may be
 * the type of printer, and the value may be a specific printer object.
 */
public class Lab16MainTask {

    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.executeMainTask();
    }
}
