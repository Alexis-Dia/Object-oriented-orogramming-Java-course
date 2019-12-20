package by.bntu.fitr.povt.alexeyd.lab15.model.logic;

import by.bntu.fitr.povt.alexeyd.lab15.model.entity.VectorContainer;

public class VectorAssistance {

    public static final int NUMMBER_OF_VALUES_IN_NON_UNIQUE_CASE = 2;
    public static final int MAX_NUMBER = 1000000;

    private static int index = -1;

    public static int[] getModifiedArray(VectorContainer vectorContainer) {
        int[] oldArr = vectorContainer.getContainer();
        int[] newArr = new int[oldArr.length];

        int minElement = getMinElement(vectorContainer);
        boolean indexOfElementIsOdd = indexOfElementIsOdd(minElement);

        if (elementIsUnique(vectorContainer, minElement) && indexOfElementIsOdd) {
            for (int i = 0; i < oldArr.length; i++) {
                if (!indexOfElementIsOdd(oldArr[i])) {
                    newArr[i] = oldArr[i] * 2;
                } else {
                    newArr[i] = oldArr[i];
                }
            }
        } else {
            for (int i = 0; i < oldArr.length; i++) {
                if (indexOfElementIsOdd(oldArr[i])) {
                    newArr[i] = oldArr[i] * 2;
                } else {
                    newArr[i] = oldArr[i];
                }
            }
        }

        return newArr;
    }

    public static  int getMinElement(VectorContainer vectorContainer) {
        int[] arr = vectorContainer.getContainer();
        int min = MAX_NUMBER;
        for (int i = 0; i < arr.length; i++) {
            //min = Math.min(min, number);
            if (arr[i] < min && arr[i] != 0) {
                min = arr[i];
            }
        }
        return min;
    }

    public static boolean elementIsUnique(VectorContainer vectorContainer, int min) {
        int[] arr = vectorContainer.getContainer();
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min && arr[i] != 0) {
                number++;
                setElIndex(i);
            }
        }
        return number < NUMMBER_OF_VALUES_IN_NON_UNIQUE_CASE ? true: false;
    }

    public static boolean indexOfElementIsOdd(int element) {
        return element % 2 != 0;
    }

    public static void setElIndex(int elIndex) {
        if (elIndex != -1) {
            index = elIndex;
        }
    }


}