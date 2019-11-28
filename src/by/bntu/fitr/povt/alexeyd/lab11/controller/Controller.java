package by.bntu.fitr.povt.alexeyd.lab11.controller;

import by.bntu.fitr.povt.alexeyd.lab11.view.Printer;
import by.bntu.fitr.povt.alexeyd.lab11.logic.ArrayWorker;
import by.bntu.fitr.povt.alexeyd.lab11.util.ArrayInitializer;

public class Controller {

    private Printer printer = new Printer();

    public void executeAdditionTask() {
        int size = 10;
        int[] array = new int[size];
        ArrayInitializer.rndInit(array, -10, 10);
        int maxAbsValue = ArrayWorker.findElementByMaxModule(array);

        int[] arrOfIndexes = ArrayWorker.getArrIndexes(array);
        if (arrOfIndexes.length > 0) {
            int sum = ArrayWorker.sumOfElements(array, arrOfIndexes[0], arrOfIndexes[1]);
            printer.print("Sum between two first positibe numbers is: " + sum);
        } else {
            printer.print("There are no two positive numbers in arr " );
        }
    }

}
