package javacore.module3.hw2;

/**
 * Created by Dobryvechir on 15.02.2017.
 */
public class Main {

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(8, 5));
        System.out.println(arithmetic.add(null, 4));

        Adder adder = new Adder();
        System.out.println(adder.add(8, 5));
        System.out.println(adder.check(8, 5));
        System.out.println(adder.check(5, 8));
        System.out.println(adder.check(8, 8));

    }

}