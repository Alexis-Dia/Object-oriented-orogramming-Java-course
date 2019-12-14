package by.bntu.fitr.povt.alexeyd.lab13.model.logic;

import java.util.Random;

public class NumberLogic {

    static Random random = new Random();

    private static void rangeCheck(int arrayLength, int fromIndex, int toIndex) {
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException(
                    "fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
        }
        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        }
        if (toIndex > arrayLength) {
            throw new ArrayIndexOutOfBoundsException(toIndex);
        }
    }

    public static int[] initArr(int size) {
        int[] arr = new int[size];
        for(int i =0; i < size; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * The range must be sorted
     * @param array
     * @param fromIndex
     * @param toIndex
     * @param key
     * @return
     */
    public static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        rangeCheck(array.length, fromIndex, toIndex);
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    public static int randomSearch(int arr[], int maxNumber, int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(maxNumber);
            if (arr[i] == randomNumber && arr[i] == elementToSearch) {
                return i;
            } else if (i == arr.length - 1) {
                i = 0;
            }
        }
        return -1;
    }

}
