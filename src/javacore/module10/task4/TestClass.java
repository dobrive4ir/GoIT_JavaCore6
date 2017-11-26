package javacore.module10.task4;

import javacore.module10.task2.NewException;

public class TestClass {

    public void g() throws NewException {
        throw new NewException("NewException in g() method");
    }

    public void f() throws NewException2 {
        try {
            g();
        } catch (NewException ne) {
            ne.printMessage();
            throw new NewException2("NewException2 in f() method");
        }
    }
}
