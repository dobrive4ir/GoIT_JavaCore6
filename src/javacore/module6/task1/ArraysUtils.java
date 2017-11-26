package javacore.module6.task1;

import java.util.ArrayList;
import java.util.List;

public final class ArraysUtils {

    private ArraysUtils() {
    }

    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }

    public static int min(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int minElem = array[0];
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            minElem = (element < minElem) ? element : minElem;
        }
        return minElem;
    }

    public static int max(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxElem = array[0];
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            maxElem = (element > maxElem) ? element : maxElem;
        }
        return maxElem;
    }

    public static int maxPositive(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = max(array);
        if (maxValue <= 0) {
            maxValue = Integer.MIN_VALUE;
        }
        return maxValue;
    }

    public static int multiplication(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int result = 1;
        for (int element : array) {
            result *= element;
        }
        return result;
    }

    public static int modulus(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int first = array[0];
        int last = array[array.length - 1];
        return first % last;
    }

    public static int secondLargest(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int element : array) {
            if (element > largest) {
                secLargest = largest;
                largest = element;
            } else if (element > secLargest) {
                secLargest = element;
            }
        }
        return secLargest;
    }

    public static int[] reverse(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
        return array;
    }

    public static Integer[] findEvenElements(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        List<Integer> evenElementsList = new ArrayList<>();
        for (int arrayElement : array) {
            if ((arrayElement % 2) == 0 && arrayElement != 0) {
                evenElementsList.add(arrayElement);
            }
        }
        return evenElementsList.toArray(new Integer[evenElementsList.size()]);
    }

}