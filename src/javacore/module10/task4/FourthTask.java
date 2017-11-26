package javacore.module10.task4;

import javacore.module10.task2.NewException;

public class FourthTask {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();

        try {
            testClass.g();
        } catch (NewException ne) {
            ne.printMessage();
            ne.printStackTrace();
        }

        try {
            testClass.f();
        } catch (NewException2 ne2) {
            System.out.println(ne2.getMessage());
            ne2.printStackTrace();
        }
    }
}
