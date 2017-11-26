package javacore.module10.task5;

public class TestClass {

    public void theMethod(String str1, String str2, String str3) {
        if (str1 == null) {
            throw new DobryException1();
        }
        if (str2.equals("mnogo")) {
            throw new DobryException2();
        }
        if (str3.equals("cast")) {
            throw new DobryException3();
        }
    }
}
