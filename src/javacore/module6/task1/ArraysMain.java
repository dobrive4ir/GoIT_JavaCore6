package javacore.module6.task1;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        int[] intArray = {32, 20, 34, 9, -7, -14, 3, 21, 12, -1};

        System.out.println("Inputted int array: " + Arrays.toString(intArray));
        System.out.println("=======================================================================");
        System.out.println("Sum of int array elements = " + ArraysUtils.sum(intArray));
        System.out.println("=======================================================================");
        System.out.println("Min element of int array = " + ArraysUtils.min(intArray));
        System.out.println("=======================================================================");
        System.out.println("Max element of int array = " + ArraysUtils.max(intArray));
        System.out.println("=======================================================================");
        System.out.println("Max positive element of int array = " + ArraysUtils.maxPositive(intArray));
        System.out.println("=======================================================================");
        System.out.println("Product of elements multiplication of int array = " + ArraysUtils.multiplication(intArray));
        System.out.println("=======================================================================");
        System.out.println("Modulus of first and last elements of int array :" + ArraysUtils.modulus(intArray));
        System.out.println("=======================================================================");
        System.out.println("Second largest element of int array = " + ArraysUtils.secondLargest(intArray));
        System.out.println("=======================================================================");
        System.out.println("Inputted array after elements reversion = " + Arrays.toString(ArraysUtils.reverse(intArray)));
        System.out.println("=======================================================================");
        System.out.println("Even elements of inputted array = " + Arrays.toString(ArraysUtils.findEvenElements(intArray)));
    }

}