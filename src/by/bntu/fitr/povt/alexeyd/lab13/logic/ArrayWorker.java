package by.bntu.fitr.povt.alexeyd.lab13.logic;

public class ArrayWorker {
    public static int findMaxElement(int[] array) {
        int elementIndex = 0;
        int maxValue = array[elementIndex];
        for (int i: array) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    public static int getResultElement(int[][] array) {
        System.out.println(array.length + "\n");
        int[] a = array[0];
        for (int row = 0; row < array.length; row++) {
            System.out.println(array.length + "\n");
        }
        return -1;
    }

    public static int[] getArrIndexes(int[] array) {
        int firstPositiveIndex = -1;
        int secondPositiveIndex = -1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && count <= 2) {
                if (count == 0) {
                    firstPositiveIndex = i;
                } else {
                    secondPositiveIndex = i;
                    break;
                }
                count++;
            }
        }
        if (firstPositiveIndex != -1 && secondPositiveIndex != -1) {
            return new int[] {firstPositiveIndex, secondPositiveIndex};
        }
        return new int[] {};
    }

    public static int sumOfElements(int[] array, int firstPositiveIndex, int secondPositiveIndex) {
        int sum = 0;
        for (int i = firstPositiveIndex; i < secondPositiveIndex - 1; i++) {
            if (i < secondPositiveIndex) {
                sum += array[i+1];
            }
        }
        return sum;
    }

    public static boolean checkIsAsc(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] > data[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIsDesc(int[] data) {
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] < data[i+1]) {
                return false;
            }
        }
        return true;
    }

}
