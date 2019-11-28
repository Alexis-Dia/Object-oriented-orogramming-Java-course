package by.bntu.fitr.povt.alexeyd.lab11.logic;

public class ArrayWorker {
    public static int findElementByMaxModule(int[] array) {
        int elementIndex = 0;
        int maxAbsValue = array[elementIndex];
        for (int i: array) {
            if (Math.abs(i) > maxAbsValue) {
                maxAbsValue = Math.abs(i);
            }
        }
        return maxAbsValue;
    }

    public static int[] sumOfElements(int[] array) {
        int indexOfFirstPositive = -1;
        int indexOfSecondPositive = -1;
        int[] positiveArr = new int[2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count > 2) {
                break;
            } else {
                if (i > 0) {
                    positiveArr[count] = array[i];
                }
            }
            count++;
        }
        return positiveArr;
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
                    firstPositiveIndex = i;
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
        for (int i = firstPositiveIndex; i < array.length; i++) {
            if (i < secondPositiveIndex) {
                sum =+ array[i];
            }
        }
        return sum;
    }

}
