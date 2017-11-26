package javacore.module2.hw1;

import java.util.Arrays;

/**
 * Input: array with size = 10 can be of one of two data types: int and double. Calculate:
 * sum
 * min/max
 * max positive
 * multiplication
 * modulus of first and last element
 * second largest element
 *
 * As a result you should have methods with following names :      +
 * sum(int array[]), sum(double[] array)                           +
 * min(int array[]), min(double[] array)                           +
 * max(int array[]), max(double[] array)                           +
 * maxPositive(int array[]), maxPositive(double array[]),          +
 * multiplication  (int array[]), multiplication (double[] array)  +
 * modulus(int array[]), modulus(double[] array)                   +
 * secondLargest(int array[]), secondLargest(double[] array)       +
 */

public class ArrayUtils {

    public static void main(String[] args) {
        int[] intArray = {32, 56, 83, 9, -7, -35, 3, 21, 12, -1};
        double[] doubleArray = {-1.0, 2.3, 5.7, -3.6, 2.73, 19.8, 21.9, 15.23, -12.235, -11.37};

        System.out.println("Inputted int array: " + Arrays.toString(intArray));
        System.out.println("=======================================================================");
        System.out.println("Inputted double array: " + Arrays.toString(doubleArray));
        System.out.println("=======================================================================");
        System.out.println("Sum of int array elements = " + sum(intArray));
        System.out.println("Sum of double array elements = " + sum(doubleArray));
        System.out.println("=======================================================================");
        System.out.println("Min element of int array = " + min(intArray));
        System.out.println("Min element of double array = " + min(doubleArray));
        System.out.println("=======================================================================");
        System.out.println("Max element of int array = " + max(intArray));
        System.out.println("Max element of double array = " + max(doubleArray));
        System.out.println("=======================================================================");
        System.out.println("Max positive element of int array = " + maxPositive(intArray));
        System.out.println("Max positive of double array = " + maxPositive(doubleArray));
        System.out.println("=======================================================================");
        System.out.println("Product of elements multiplication of int array = " + multiplication(intArray));
        System.out.println("Product of elements multiplication of double array = " + multiplication(doubleArray));
        System.out.println("=======================================================================");
        System.out.println("Modulus of first and last elements of int array :" + Arrays.toString(modulus(intArray)));
        System.out.println("Modulus of first and last elements of double array :" + Arrays.toString(modulus(doubleArray)));
        System.out.println("=======================================================================");
        System.out.println("Second largest element of int array = " + secondLargest(intArray));
        System.out.println("Second largest element of double array = " + secondLargest(doubleArray));

    }

    private static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int result = 0;
        for (int element : array) {
            result += element;
        }
        return result;
    }

    private static double sum(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MIN_VALUE;
        }

        double result = 0;
        for (double element : array) {
            result += element;
        }
        return result;
    }

    private static int min(int[] array) {
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

    private static double min(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MIN_VALUE;
        }

        double minElem = array[0];
        for (int i = 1; i < array.length; i++) {
            double element = array[i];
            minElem = (element < minElem) ? element : minElem;
        }
        return minElem;
    }

    private static int max(int[] array) {
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

    private static double max(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MIN_VALUE;
        }

        double maxElem = array[0];
        for (int i = 1; i < array.length; i++) {
            double element = array[i];
            maxElem = (element > maxElem) ? element : maxElem;
        }
        return maxElem;
    }

    private static int maxPositive(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxValue = max(array);
        if (maxValue <= 0) {
            maxValue = Integer.MIN_VALUE;
        }
        return maxValue;
    }

    private static double maxPositive(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MIN_VALUE;
        }

        double maxValue = max(array);
        if (maxValue <= 0) {
            maxValue = Integer.MIN_VALUE;
        }
        return maxValue;
    }

    private static int multiplication(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int result = 1;
        for (int element : array) {
            result *= element;
        }
        return result;
    }

    private static double multiplication(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MIN_VALUE;
        }

       double result = 1;
        for (double element : array) {
            result *= element;
        }
        return result;
    }

    private static int[] modulus(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int[] resultArray = new int[2];
        resultArray[0] = Math.abs(array[0]);
        resultArray[1] = Math.abs(array[array.length - 1]);

        return resultArray;
    }

    private static double[] modulus(double[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        double[] resultArray = new double[2];
        resultArray[0] = Math.abs(array[0]);
        resultArray[1] = Math.abs(array[array.length - 1]);

        return resultArray;
    }

    private static int secondLargest(int[] array) {
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

    private static double secondLargest(double[] array) {
        if (array == null || array.length == 0) {
            return Double.MIN_VALUE;
        }

        double largest = Double.MIN_VALUE;
        double secLargest = Double.MIN_VALUE;
        for (double element : array) {
            if (element > largest) {
                    secLargest = largest;
                    largest = element;
            } else if (element > secLargest) {
                    secLargest = element;
            }
        }
        return secLargest;
    }

}