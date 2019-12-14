package by.bntu.fitr.povt.alexeyd.lab13.controller;

import by.bntu.fitr.povt.alexeyd.lab13.logic.ArrayWorker;
import by.bntu.fitr.povt.alexeyd.lab13.util.ArrayInitializer;
import by.bntu.fitr.povt.alexeyd.lab13.util.UserInput;
import by.bntu.fitr.povt.alexeyd.lab13.view.Printer;

public class Controller {

    private Printer printer = new Printer();

    public void executeAdditionTaskA() {

        //int[][] multiArray = new int[][] {{2, 3, 5}, {7, 2, 0}};

        //int sizeX = 3;
        //int sizeY = 3;
        //int[][] multiArray = new int[sizeX][sizeY];
        //ArrayInitializer.rndInit(multiArray, -10, 10);

        int sizeX = (int) UserInput.positiveInput("Input first positive value:");
        int sizeY = (int) UserInput.positiveInput("Input first positive value:");
        int[][] multiArray = new int[sizeX][sizeY];
        ArrayInitializer.initFromScaner(multiArray);

        printer.printMultiArr(multiArray);

        for (int row = 0; row < multiArray.length; row++) {
            int[] flatArr = multiArray[row];
            boolean isOrderedByAsc = ArrayWorker.checkIsAsc(flatArr);
            boolean isOrderedByDesc = ArrayWorker.checkIsDesc(flatArr);
            if (isOrderedByAsc || isOrderedByDesc) {
                int maxValueInOrderedRow = ArrayWorker.findMaxElement(flatArr);
                printer.print("Max value in ordered row =  " + row + ", is: "  +  + maxValueInOrderedRow + "\n");
            }
        }

    }

}
